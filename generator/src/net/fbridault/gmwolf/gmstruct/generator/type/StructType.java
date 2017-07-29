package net.fbridault.gmwolf.gmstruct.generator.type;

import net.fbridault.gmwolf.gmstruct.generator.Struct;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 17/07/2017.
 */
public class StructType extends Type {

    private Struct struct;

    private static Map<Struct, StructType> structs= new HashMap<>();

    public static  StructType get(Struct struct) {
        if (struct == null) {
            return null;
        }

        if (!structs.containsKey(struct)) {
            structs.put(struct, new StructType(struct));
        }

        return structs.get(struct);
    }

    private StructType(Struct struct) {
        this.struct = struct;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StructType)) {
            return false;
        }
        return struct.equals(((StructType) obj).struct);
    }

    public Struct getStruct() {
        return struct;
    }

    @Override
    public boolean assignsTo(Type type) {
        if (type.equals(this)) {
            return true;
        }

        if (struct.getParent() != null) {
            return assignsTo(new StructType(struct.getParent()));
        }

        return false;
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
