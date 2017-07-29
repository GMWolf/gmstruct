package net.fbridault.gmwolf.gmstruct.generator;

import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructBaseListener;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructLexer;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.AttributeContext;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.FileContext;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.StructContext;
import net.fbridault.gmwolf.gmstruct.generator.type.Type;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.jgrapht.DirectedGraph;
import org.jgrapht.alg.CycleDetector;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.TopologicalOrderIterator;

import java.io.IOException;

/**
 * Created by felix on 01/07/2017.
 */

public class Parser extends GMStructBaseListener{
    Struct currentStruct;
    NameSpace currentNameSpace;
    NameSpace globalNameSpace;
    int nextStructId;

    DirectedGraph<Struct, DefaultEdge> dependencies;

    public Parser() {
        dependencies = new DefaultDirectedGraph<>(DefaultEdge.class);
        currentNameSpace = null;
        globalNameSpace = new GlobalNameSpace();
        currentNameSpace = globalNameSpace;
        nextStructId = 0;
    }


    public NameSpace parseFile(String fileName) throws IOException {
        FileContext context = readFile(fileName);
        genStructs(context);
        return globalNameSpace;
    }

    private FileContext readFile(String fileName) throws IOException {

        //Create lexer
        GMStructLexer lexer;
        lexer = new GMStructLexer(CharStreams.fromFileName(fileName));
        TokenStream tokenStream = new CommonTokenStream(lexer);

        //Create parser
        GMStructParser parser = new GMStructParser(tokenStream);

        return parser.file();
    }

    /**
     * Generates a set of struct from the given struct list context
     * @param fileContext context to build structs from
     * @return returns a collection of generated structs
     */
    private void genStructs(FileContext fileContext) {

        //Get the structs from the parse tree
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, fileContext);

        //Set dependencies
        CycleDetector<Struct, DefaultEdge> cycleDetector = new CycleDetector<>(dependencies);

        globalNameSpace.forEachStruct((struct)-> {
            StructContext context = struct.getContext();
            if (context.parent != null) {
                StructPath parentPath = new StructPath(context.parent);
                Struct parent = struct.getNameSpace().findStruct(parentPath);
                if (parent == null) { //unknown parent
                    throw  new GMSException(context, ":\nUnknown struct " + context.parent.getText() + ".");
                }
                struct.setParent(parent);
                dependencies.addEdge(parent, struct);

                //Check for dependency cycle
                if (cycleDetector.detectCyclesContainingVertex(struct)) {
                    throw new GMSException(context, ":\nDependency cycle detected with struct " + struct.getName());
                }
            }
        });


        //Add attributes and flags
        //iterate in topological order (parent first)
        TopologicalOrderIterator<Struct, DefaultEdge> iterator = new TopologicalOrderIterator<>(dependencies);
        iterator.forEachRemaining((struct) -> {

            struct.createFlags(dependencies.vertexSet().size());

            //Append parent attributes and flags
            if (struct.hasParent()) {
                struct.addFlags(struct.getParent().getFlags());
                struct.appendAttributes(struct.getParent().getAttributes());
            }

            //Append attributes from context
            StructContext context = struct.getContext();
            for(AttributeContext attributeContext : context.attributeList().attribute()) {
                String name = attributeContext.name.getText();
                Type type = attributeContext.type == null ? null :  Type.get(currentNameSpace, attributeContext.type.getText());
                String def = attributeContext.def == null ? null : attributeContext.def.getText();

                if (struct.hasAttribute(name)) {
                    throw new GMSException(context, ":\nAttribute already defined.");
                }

                struct.appendAttribute(new Attribute(type, name, def));
            }


            //Append functions
            if (struct.getContext().funtionList() != null)
            for (GMStructParser.FunctionContext functionContext : struct.getContext().funtionList().function()) {
                struct.addFunction(new Function(struct, functionContext));
            }
        });




    }

    @Override
    public void enterStruct(StructContext ctx) {
        String name = ctx.name.getText();
        int id = nextStructId++;

        currentStruct = new Struct(currentNameSpace, id, ctx);

        if (currentNameSpace.addStruct(currentStruct)) {
            throw new GMSException(ctx, ":\nStruct " + name + " already defined!");
        }
        dependencies.addVertex(currentStruct);


    }

    @Override
    public void exitStruct(StructContext ctx) {
        currentStruct = null;
    }

    @Override
    public void enterNameSpace(GMStructParser.NameSpaceContext ctx) {
       currentNameSpace = new NameSpace(currentNameSpace, ctx.name.getText());
    }

    @Override
    public void exitNameSpace(GMStructParser.NameSpaceContext ctx) {
        currentNameSpace = currentNameSpace.getParent();
    }
}
