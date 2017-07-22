package net.fbridault.gmwolf.gmstruct.generator;

import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.IdContext;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.StructPathContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 02/07/2017.
 */
public class StructPath {
    private List<String> parts;

    private StructPath() {
        parts = new ArrayList<>();
    }

    public StructPath(StructPathContext context) {
        this();
        for(IdContext node : context.id()) {
            parts.add(node.getText());
        }
    }

    private StructPath (StructPath structPath) {
        this();
        for(int i = 1; i < structPath.parts.size(); i++) {
            parts.add(structPath.parts.get(i));
        }
    }

    public boolean isName() {
        return parts.size() == 1;
    }

    public String getOuter() {
        return parts.get(0);
    }

    public StructPath truncate() {
        return new StructPath(this);
    }
}
