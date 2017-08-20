package net.fbridault.gmwolf.gmstruct.generator;

import net.fbridault.gmwolf.gmstruct.generator.ir.Script;

import java.io.IOException;
import java.util.*;

/**
 * Created by felix on 02/07/2017.
 */
public class Generator {

    public static List<Script> generateScripts(String file) {
        List<Script> scripts = new ArrayList<>();
        Parser parser = new Parser();

        try {
            NameSpace nameSpace = parser.parseFile(file);

            Set<Struct> structs = new HashSet<>();
            nameSpace.forEachStruct((struct) ->{
                scripts.addAll(struct.getScripts());
                structs.add(struct);
            });

            scripts.add(getGlobalScript(structs));
            scripts.add(getTypeScript());
            scripts.add(getIsAScript());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return scripts;
    }

    private static Script getGlobalScript(Set<Struct> structs) {
        Script script = new Script("_structs", "");
        script.append("gml_pragma(\"global\", \"_structs()\");\n");

        StringBuilder enumBuilder = new StringBuilder();
        StringBuilder flagsBuilder = new StringBuilder();

        enumBuilder.append("enum structs {\n");

        Iterator<Struct> structIterator = structs.iterator();
        while(structIterator.hasNext()) {
            Struct struct = structIterator.next();
            enumBuilder.append("\t").append(struct.getGMLName()).append(" = ").append(struct.getId());
            if (structIterator.hasNext()) {
                enumBuilder.append(",\n");
            } else {
                enumBuilder.append("\n");
            }

            flagsBuilder.append("global._struct_flag[").append(struct.getId()).append("] = [");
            for(int i = 0; i < struct.getFlags().length; i++) {
                flagsBuilder.append(struct.getFlags()[i]);
                if (i < struct.getFlags().length - 1) {
                    flagsBuilder.append(',');
                }
            }

            flagsBuilder.append("];\n");
        }

        enumBuilder.append("}\n");

        script.append(enumBuilder);
        script.append(flagsBuilder);

        return script;
    }

    private static Script getTypeScript() {
        Script script = new Script("get_type", "returns the type of the given struct");
        script.addParameter("struct", "the struct to find the type of");
        script.append("return argument0[0]");
        return script;
    }

    private static Script getIsAScript() {
        Script script = new Script("is_a", "check if the struct is of the given type");
        script.addParameter("struct", "the struct to check");
        script.addParameter("type", "the type to check");
        script.append("if (!is_array(argument0) || array_length_1d(argument0) == 0)\n")
                .append("\t return false;\n");
        script.append("var i = argument0[0];\n");
        script.append("var f = global._struct_flag[i];\n");
        script.append("return f[argument1 div ").append(Struct.FLAG_BITS).append("] & ").append("1<<(argument1 % ").append(Struct.FLAG_BITS).append(");");
        return script;
    }
}
