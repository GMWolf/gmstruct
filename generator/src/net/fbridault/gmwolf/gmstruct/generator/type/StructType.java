package net.fbridault.gmwolf.gmstruct.generator.type;

import net.fbridault.gmwolf.gmstruct.generator.Struct;

/**
 * Created by felix on 17/07/2017.
 */
public class StructType implements Type {

    private Struct struct;

    public StructType(Struct struct) {
        this.struct = struct;
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
