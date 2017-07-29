package net.fbridault.gmwolf.gmstruct.generator;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by felix on 25/07/2017.
 */
public class GMSException extends RuntimeException {
    public GMSException(ParserRuleContext ctx, String message) {
        super("Error at line " + ctx.start.getLine() +". " + message);
    }
}
