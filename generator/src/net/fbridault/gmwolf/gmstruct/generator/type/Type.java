package net.fbridault.gmwolf.gmstruct.generator.type;

import net.fbridault.gmwolf.gmstruct.generator.NameSpace;
import net.fbridault.gmwolf.gmstruct.generator.Parser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 17/07/2017.
 */
public interface Type {

    // region GM types

    final static Type STRING = new Type() {
        @Override
        public String getChecker() {
            return "is_string({0})";
        }

        @Override
        public String toString() {
            return "string";
        }
    };

    final static Type REAL = new Type() {
        @Override
        public String getChecker() {
            return "is_real({0})";
        }

        @Override
        public String toString() {
            return "real";
        }
    };

    final static Type POINTER = new Type() {
        @Override
        public String getChecker() {
            return "is_pointer({0})";
        }

        @Override
        public String toString() {
            return "pointer";
        }
    };

    final static Type ARRAY = new Type() {
        @Override
        public String getChecker() {
            return "is_array({0})";
        }

        @Override
        public String toString() {
            return "array";
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
    static Type get(NameSpace nameSpace, String name) {
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




    String getChecker();
}
