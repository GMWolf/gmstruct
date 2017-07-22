package net.fbridault.gmwolf.gmstruct.generator;

import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructBaseListener;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructLexer;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.FunctionContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.*;

import static net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.*;

/**
 * Created by felix on 21/07/2017.
 */
public class Function {
    String name;
    Struct struct;
    FunctionContext context;

    private static Set<String> GML_VAR_NAMES = getGmlVarNames();

    private  static Set<String> getGmlVarNames() {
        Set<String> strings = new HashSet<>();
        try {
            Scanner scanner = new Scanner(new File("gmlVarNames.txt"));
            while (scanner.hasNext()) {
                strings.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public Function(Struct struct, FunctionContext context) {
        this.context = context;
        name = context.name.getText();
        this.struct = struct;
    }

    public Script getScript() {
        Script script =  new Script(struct.getGMLName() + "_" + name, "");

        List<String> args = new ArrayList<>();
        for(IdContext id : context.idList().id()) {
            args.add(id.getText());
            script.addParameter(id.getText(), "");
        }

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new GMStructBaseListener() {
            @Override
            public void visitTerminal(TerminalNode node) {
                //Check for replacements id ID
                if (node.getSymbol().getType() == GMStructLexer.ID) {
                    if (struct.hasAttribute(node.getText())) { //is a struct attribute
                        script.append("argument0[").append(struct.getAttributePos(node.getText())+1).append("]");
                    } else if (args.contains(node.getText())) {  //Is an argument?
                        script.append("argument").append(args.indexOf(node.getText())+1);
                    } else if (GML_VAR_NAMES.contains(node.getText())) { //is build int var?
                        script.append("_").append(node.getText());
                    } else {
                        script.append(node.getText());
                    }
                } else {
                    script.append(node.getText());
                }
            }

            @Override
            public void exitStat(StatContext ctx) {
                script.append("\n");
            }
        }, context.block());

        return script;
    }



}
