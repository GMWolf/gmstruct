package net.fbridault.gmwolf.gmstruct.generator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Created by felix on 02/07/2017.
 */
public class NameSpace{
    Map<String, Struct> structs;
    Map<String, NameSpace> children;

    String name;
    NameSpace parent;

    public NameSpace(NameSpace parent, String name) {
        this.parent = parent;
        this.name = name;
        structs = new HashMap<>();
        children = new HashMap<>();
        if (parent != null) {
            parent.children.put(name, this);
        }
    }

    public boolean addStruct(Struct struct) {
        return structs.put(struct.getName(), struct) != null;
    }

    public Struct getStruct(String name) {
        return structs.get(name);
    }

    public Struct findStruct(StructPath path) {
        if (path.isName()) {
            if (structs.containsKey(path.getOuter())) {
                return structs.get(path.getOuter());
            }
        } else {
            if (children.containsKey(path.getOuter())) {
                NameSpace child = children.get(path.getOuter());
                return child.findStruct(path.truncate());
            }
        }

        if (parent != null) {
            return parent.findStruct(path);
        }

        return null;
    }

    public NameSpace getParent() {
        return parent;
    }

    public String getCanonicalName() {
        if (parent != null) {
            return parent.getCanonPrefix() + name;
        }
        return name;
    }

    String getCanonPrefix() {
        return getCanonicalName() + ".";
    }

    public String getGMLName() {
        return getCanonicalName().replaceAll("_", ".");
    }

    public String getGMLPrefix() {
        return getGMLName() + "_";
    }

    public void forEachStruct(Consumer<? super Struct> action) {
        for(Struct struct : structs.values()) {
            action.accept(struct);
        }

        for(NameSpace child : children.values()) {
            child.forEachStruct(action);
        }
    }
}
