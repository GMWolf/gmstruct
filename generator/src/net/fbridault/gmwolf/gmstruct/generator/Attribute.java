package net.fbridault.gmwolf.gmstruct.generator;

/**
 * Represents an attribute with default value
 * Created by felix on 01/07/2017.
 */
public class Attribute {
    private String name;
    private String def;

    public Attribute(String name, String def) {
        if (name == null) {
            throw new IllegalArgumentException("Attribute name cannot be null");
        }
        this.name = name;
        this.def = def;
    }

    public Attribute(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
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
