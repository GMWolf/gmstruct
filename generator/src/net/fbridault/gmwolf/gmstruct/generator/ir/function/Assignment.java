package net.fbridault.gmwolf.gmstruct.generator.ir.function;

/**
 * Created by felix on 20/08/2017.
 */
public class Assignment {
    String varname;
    Expr expr;

    public Assignment(String varname, Expr expr) {
        this.varname = varname;
        this.expr = expr;
    }
}
