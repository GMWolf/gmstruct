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

        @Override
        public boolean assignsTo(Type type) {
            return type.equals(STRING);
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
            } else  if (other.equals(Type.STRING)) {
                return super.getTypeAdd(other);
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

        @Override
        public boolean assignsTo(Type type) {
            return type.equals(REAL);
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

        @Override
        public boolean assignsTo(Type type) {
            return type.equals(POINTER);
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

        @Override
        public boolean assignsTo(Type type) {
            return type.equals(ARRAY);
        }

        @Override
        public Type getTypeAdd(Type other) {
            if (other.equals(STRING)) {
                return STRING;
            }

            return super.getTypeAdd(other);
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

        @Override
        public boolean assignsTo(Type type) {
            return type.equals(BOOLEAN);
        }

        @Override
        public Type getTypeAdd(Type other) {
            if (other.equals(STRING)) {
                return STRING;
            }

            return super.getTypeAdd(other);
        }
    };

    //endregion

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
            case "boolean" : return BOOLEAN;
        }

        return StructType.get(nameSpace.getStruct(name));
    }


    /**
     * Checks if a value of this type can be assigned to a variable of the given type
     * @param type
     * @return
     */
    public abstract boolean assignsTo(Type type);

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
