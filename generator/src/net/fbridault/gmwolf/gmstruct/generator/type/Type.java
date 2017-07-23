package net.fbridault.gmwolf.gmstruct.generator.type;

import net.fbridault.gmwolf.gmstruct.generator.NameSpace;
import net.fbridault.gmwolf.gmstruct.generator.Parser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 17/07/2017.
 */
public abstract class Type {

    // region GM types

    public final static Type STRING = new Type() {
        @Override
        public String getChecker() {
            return "is_string({0})";
        }

        @Override
        public Type getTypeAdd(Type other) {
            return Type.STRING;
        }

        @Override
        public String toString() {
            return "string";
        }
    };

    public final static Type REAL = new Type() {
        @Override
        public String getChecker() {
            return "is_real({0})";
        }

        @Override
        public Type getTypeAdd(Type other) {
            if (other.equals(Type.REAL)) {
                return Type.REAL;
            } else {
                return super.getTypeAdd(other);
            }
        }

        @Override
        public Type getTypeSub(Type other) {
            if (other.equals(Type.REAL)) {
                return Type.REAL;
            } else {
                return super.getTypeSub(other);
            }
        }

        @Override
        public Type getTypeMul(Type other) {
            if (other.equals(Type.REAL)) {
                return Type.REAL;
            } else {
                return super.getTypeMul(other);
            }
        }

        @Override
        public Type getTypeDiv(Type other) {
            if (other.equals(Type.REAL)) {
                return Type.REAL;
            } else {
                return super.getTypeDiv(other);
            }
        }

        @Override
        public String toString() {
            return "real";
        }
    };

    public final static Type POINTER = new Type() {
        @Override
        public String getChecker() {
            return "is_pointer({0})";
        }

        @Override
        public String toString() {
            return "pointer";
        }
    };

    public final static Type ARRAY = new Type() {
        @Override
        public String getChecker() {
            return "is_array({0})";
        }

        @Override
        public String toString() {
            return "array";
        }
    };

    public final static Type BOOLEAN = new Type() {
        @Override
        public String getChecker() {
            return "is_bool({0})";
        }

        @Override
        public String toString() {
            return "boolean";
        }
    };

    //endregion

    static Map<String, Type> types = new HashMap<>();

    /**
     * Finds the type from a string for the given parser object
     * @param nameSpace
     * @param name
     * @return
     */
    public static Type get(NameSpace nameSpace, String name) {
        switch (name) {
            case "string": return STRING;
            case "real" : return REAL;
            case "pointer" : return POINTER;
            case "array" : return ARRAY;
        }

        if (!types.containsKey(name)) {
            types.put(name, new StructType(nameSpace.getStruct(name)));
        }

        return types.get(name);
    }




    public abstract String getChecker();

    public Type getTypeAdd(Type other) {
        return null;
    }

    public Type getTypeSub(Type other) {
        return null;
    }

    public Type getTypeMul(Type other) {
        return null;
    }

    public Type getTypeDiv(Type other) {
        return null;
    }
}
