package net.fbridault.gmwolf.gmstruct.generator.ir.function;

/**
 * Created by felix on 20/08/2017.
 */
public class Expr {

    public class OpExpr {
        String op;
        Expr l;
        Expr r;
        public OpExpr(String op, Expr l, Expr r) {
            this.op = op;
            this.l = l;
            this.r = r;
        }
    }
}
