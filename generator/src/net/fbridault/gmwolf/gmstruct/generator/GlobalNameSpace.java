package net.fbridault.gmwolf.gmstruct.generator;

/**
 * Created by felix on 02/07/2017.
 */
public class GlobalNameSpace extends NameSpace {
    public GlobalNameSpace() {
        super(null, "");
    }

    @Override
    public String getCanonicalName() {
        return "";
    }

    @Override
    String getCanonPrefix() {
        return "";
    }

    @Override
    public String getGMLPrefix() {
        return "";
    }
}
