package net.fbridault.gmwolf.gmstruct.generator.type;

import net.fbridault.gmwolf.gmstruct.generator.Struct;

/**
 * Created by felix on 17/07/2017.
 */
public class StructType extends Type {

    private Struct struct;

    public StructType(Struct struct) {
        this.struct = struct;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StructType)) {
            return false;
        }
        return struct.equals(((StructType) obj).struct);
    }

    @Override
    public String getChecker() {
        return "is_" + struct.getGMLName() + "({0})";
    }

    @Override
    public String toString() {
        return struct.getGMLName();
    }
}
