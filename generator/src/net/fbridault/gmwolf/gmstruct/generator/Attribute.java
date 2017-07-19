package net.fbridault.gmwolf.gmstruct.generator;

import net.fbridault.gmwolf.gmstruct.generator.type.Type;

/**
 * Represents an attribute with default value
 * Created by felix on 01/07/2017.
 */
public class Attribute {
    private String name;
    private String def;

    private Type type;

    public Attribute(Type type, String name, String def) {
        if (name == null) {
            throw new IllegalArgumentException("Attribute name cannot be null");
        }
        this.name = name;
        this.def = def;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getDefault() {
        return def;
    }

    public boolean hasDefault() {
        return def != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attribute attribute = (Attribute) o;

        return name.equals(attribute.name);
    }



    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
