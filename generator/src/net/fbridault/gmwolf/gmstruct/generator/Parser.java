package net.fbridault.gmwolf.gmstruct.generator;

import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructLexer;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.AttributeContext;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.StructContext;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.StructListContext;
import org.antlr.v4.runtime.*;
import org.jgrapht.DirectedGraph;
import org.jgrapht.alg.CycleDetector;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.TopologicalOrderIterator;

import java.io.IOException;
import java.util.*;

/**
 * Created by felix on 01/07/2017.
 */

public class Parser {

    public static Set<Struct> parseFile(String fileName) throws IOException {
        StructListContext context = readFile(fileName);
        return new HashSet<>(genStructs(context));
    }

    private static StructListContext readFile(String fileName) throws IOException {

        //Create lexer
        GMStructLexer lexer;
        lexer = new GMStructLexer(CharStreams.fromFileName(fileName));
        TokenStream tokenStream = new CommonTokenStream(lexer);

        //Create parser
        GMStructParser parser = new GMStructParser(tokenStream);

        return parser.structList();
    }

    /**
     * Generates a set of struct from the given struct list context
     * @param structListContext context to build structs from
     * @return
     */
    private static Collection<Struct> genStructs(StructListContext structListContext) {
        Map<String, Struct> structMap = new HashMap<>();
        Map<Struct, StructContext> structContextMap = new HashMap<>();
        DirectedGraph<Struct, DefaultEdge> dependencies = new DefaultDirectedGraph<Struct, DefaultEdge>(DefaultEdge.class);

        //Get all structs
        int id = 0;
        for(StructContext context : structListContext.struct()) {
            String name = context.name.getText();
            Struct struct = new Struct(id++, name);
            Struct pre = structMap.put(name, struct);
            if (pre != null) { //Struct already defined
                throw new RuntimeException("Error at line " + context.getStart().getLine() + ":\nStruct " + name + " already defined!");
            }
            dependencies.addVertex(struct);
            structContextMap.put(struct, context);
        }



        //Set dependencies
        CycleDetector<Struct, DefaultEdge> cycleDetector = new CycleDetector<>(dependencies);
        for(Struct struct : structMap.values()) {
            StructContext context = structContextMap.get(struct);
            if (context.parent != null) {
                Struct parent = structMap.get(context.parent.getText());
                if (parent == null) { //unknown parent
                    throw  new RuntimeException("Error at line " + context.getStart().getLine() + ":\nUnknown struct " + context.parent.getText() + ".");
                }
                struct.setParent(parent);
                dependencies.addEdge(parent, struct);

                //Check for dependency cycle
                if (cycleDetector.detectCyclesContainingVertex(struct)) {
                    throw new RuntimeException("Error ar line " + context.getStart().getLine() + ":\nDependency cycle detected with struct " + struct.getName());
                }
            }
        }


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
            StructContext context = structContextMap.get(struct);
            for(AttributeContext attributeContext : context.attributeList().attribute()) {
                String name = attributeContext.name.getText();
                String def = null;
                if (attributeContext.def != null) {
                    def = attributeContext.def.getText();
                }
                if (struct.hasAttribute(name)) {
                    throw new RuntimeException("Error at line " + context.getStart().getLine() +":\nAttribute already defined.");
                }
                struct.appendAttribute(new Attribute(name, def));
            }
        });

        return structMap.values();
    }

}
