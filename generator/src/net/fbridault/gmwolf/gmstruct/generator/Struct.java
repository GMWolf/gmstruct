package net.fbridault.gmwolf.gmstruct.generator;

import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser;

import javax.print.attribute.standard.MediaSize;
import java.util.*;

/**
 * Represents a Struct, including its attributes
 * Created by felix on 01/07/2017.
 */
public class Struct implements Iterable<Attribute>{

    static final int FLAG_BITS = 32;

    private String name;
    private List<Attribute> attributes;
    private Struct parent;
    private int[] flags;
    private int id;

    private NameSpace nameSpace;

    private GMStructParser.StructContext context;


    public Struct(NameSpace nameSpace, int id, String name, Struct parent) {
        this.id = id;
        this.name = name;
        attributes = new ArrayList<>();
        this.parent = parent;
        this.nameSpace = nameSpace;
    }

    public Struct(NameSpace nameSpace, int id, String name) {
        this(nameSpace, id, name,null);
    }

    public Struct(NameSpace nameSpace, int id, GMStructParser.StructContext ctx) {
        this(nameSpace, id, ctx.name.getText());
        this.context = ctx;
    }

    public GMStructParser.StructContext getContext() {
        return context;
    }

    //region struct stuff
    public int getId() {
        return id;
    }

    public void createFlags(int count) {
        flags = new int[(count / 32) + 1];
        flags[id / FLAG_BITS] = 1 << (id % FLAG_BITS);
    }

    public void addFlags(int[] parentFlags) {
        for(int i = 0; i < parentFlags.length; i++) {
            flags[i] |= parentFlags[i];
        }
    }

    public int[] getFlags() {
        return flags;
    }

    /**
     * Adds the attribute list to the end of the existing list
     * @param attributes the list of attributes to append
     */
    public void appendAttributes(List<Attribute> attributes) {
        this.attributes.addAll(attributes);
    }

    /**
     * Appemds an attribute to the end of the existing list
     * @param attribute tje attribute to append
     */
    public void appendAttribute(Attribute attribute) {
        attributes.add(attribute);
    }

    /**
     * returns the attribute with the given index
     * @param i the index to return the attribute of.
     * @return attribute at position
     */
    public Attribute getAttribute(int i) {
        return attributes.get(i);
    }

    /**
     * returns the attribute with the given name, or null if none exits
     * @param name the name of the attribute to search for.
     * @return attribute with name
     */
    public Attribute getAttribute(String name) {
        for(Attribute attribute : this) {
            if (attribute.getName().equals(name)) {
                return attribute;
            }
        }

        return null;
    }

    public int getAttributePos(Attribute attribute) {
        return attributes.indexOf(attribute);
    }

    public boolean hasAttribute(String name) {
        for(Attribute attribute : this) {
            if (attribute.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean hasParent() {
        return parent!=null;
    }

    public void setParent(Struct parent) {
        this.parent = parent;
    }

    /**
     * Gets the structs parent
     * @return
     */
    public Struct getParent() {
        return parent;
    }

    /**
     * Gets the list of attributes
     * <p>
     * Note: This is not an immutable list, and changes made to the list will be reflected in the struct.
     * </p>
     * @return the list of attributes.
     */
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public Iterator<Attribute> iterator() {
        return attributes.iterator();
    }
    //endregion

    //region writing

    public String getGMLName() {
        return nameSpace.getGMLPrefix() + name;
    }

    public NameSpace getNameSpace() {
        return nameSpace;
    }

    /**
     * Returns the creation script
     * @return
     */
    public Script getNewScript() {
        String desc = "returns a new " + name + " struct\n";
        Script script = new Script("new_" + getGMLName(), desc);

        script.append("return [").append(id);

        int argumentCount = 0;
        for(Attribute attribute : this) {
            script.append(", ");
            if (attribute.hasDefault()) {
                script.append(attribute.getDefault());
            } else {
                script.addParameter(attribute.getName(), "");
                script.append("argument").append(argumentCount++);
            }
        }

        script.append("]");

        return script;
    }

    public Script getGetSetter(Attribute attribute) {
        int index = getAttributePos(attribute) + 1;
        String desc = "returns " + attribute.getName() + " and sets it if argument provided.";
        Script script = new Script(getGMLName() + "_" + attribute.getName(), desc);
        script.addParameter(getName(), "The struct to set " + attribute.getName() + " attribute of.");
        script.addParameter("*value", "The value to set " + attribute.getName() +" to.");
        script.append(check());
        script.append("var s = argument[0];\n")
                .append("if (argument_count == 2) {\n")
                .append("\ts[@ ").append(index).append("] = argument[1];\n")
                .append("}\n")
                .append("return s[").append(index).append("];");

        return script;
    }

    public String check() {
        return "if !is_" + getGMLName() + "(argument[0])\n" +
                "\tshow_error(\"Struct is not of type " + getName() + ".\", true);\n";
    }

    public Script getIs() {
        String desc = "Check if the struct is of type " + getName();
        Script script = new Script("is_" + getGMLName(), desc);
        script.addParameter("Struct", "the struct to check");
        script.append("if (!is_array(argument0) || array_length_1d(argument0) == 0)\n")
                .append("\t return false;\n");
        script.append("var i = argument0[0];\n");
        script.append("var f = global._struct_flag[i];\n");
        script.append("return f[").append(id/FLAG_BITS).append("] & ").append(1<<(id % FLAG_BITS));

        return script;
    }

    public List<Script> getScripts() {
        List<Script> scripts = new ArrayList<>();
        scripts.add(getNewScript());
        scripts.add(getIs());
        for(Attribute attribute : this) {
            scripts.add(getGetSetter(attribute));
        }

        return scripts;
    }

    //endregion
}
