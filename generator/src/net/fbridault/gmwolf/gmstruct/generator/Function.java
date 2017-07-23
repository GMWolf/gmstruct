package net.fbridault.gmwolf.gmstruct.generator;

import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructBaseListener;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructBaseVisitor;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructLexer;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.FunctionContext;
import net.fbridault.gmwolf.gmstruct.generator.type.Type;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.*;

import static net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.*;

/**
 * Created by felix on 21/07/2017.
 */
public class Function {
    String name;
    Struct struct;
    FunctionContext context;
    Type type;

    private static Set<String> GML_VAR_NAMES = getGmlVarNames();

    private  static Set<String> getGmlVarNames() {
        Set<String> strings = new HashSet<>();
        try {
            Scanner scanner = new Scanner(new File("gmlVarNames.txt"));
            while (scanner.hasNext()) {
                strings.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public Function(Struct struct, FunctionContext context) {
        this.context = context;
        name = context.name.getText();
        this.struct = struct;
        type = Type.get(struct.getNameSpace(), context.type.getText());
    }

    public Script getScript() {
        Script script =  new Script(struct.getGMLName() + "_" + name, "");

        List<String> args = new ArrayList<>();
        for(IdContext id : context.idList().id()) {
            args.add(id.getText());
            script.addParameter(id.getText(), "");
        }

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new GMStructBaseListener() {
            @Override
            public void visitTerminal(TerminalNode node) {
                //Check for replacements id ID
                if (node.getSymbol().getType() == GMStructLexer.ID) {
                    if (struct.hasAttribute(node.getText())) { //is a struct attribute
                        script.append("argument0[").append(struct.getAttributePos(node.getText())+1).append("]");
                    } else if (args.contains(node.getText())) {  //Is an argument?
                        script.append("argument").append(args.indexOf(node.getText())+1);
                    } else if (GML_VAR_NAMES.contains(node.getText())) { //is build int var?
                        script.append("_").append(node.getText());
                    } else {
                        script.append(node.getText());
                    }
                } else {
                    script.append(node.getText());
                }
            }

            @Override
            public void exitStat(StatContext ctx) {
                script.append("\n");
            }

            @Override
            public void enterDotExpr(DotExprContext ctx) {
                super.enterDotExpr(ctx);
            }
        }, context.block());

        return script;
    }


    class staticAnalyzer extends GMStructBaseListener {

        Map<String, Type> types = new HashMap<>();

        ParseTreeProperty<Type> exprType = new ParseTreeProperty<>();

        //region expression

        @Override
        public void exitValExpr(ValExprContext ctx) {
            exprType.put(ctx,exprType.get(ctx.getChild(0)));
        }

        @Override
        public void exitNum(NumContext ctx) {
            exprType.put(ctx, Type.REAL);
        }

        @Override
        public void exitStr(StrContext ctx) {
            exprType.put(ctx, Type.STRING);
        }

        @Override
        public void exitFunctionCall(FunctionCallContext ctx) {
            if (!struct.hasFunction(name)) {
                throw new RuntimeException("Unknown function " + ctx.name.getText());
            }

            exprType.put(ctx, struct.getFunction(ctx.name.getText()).type);
        }

        @Override
        public void exitEqExpr(EqExprContext ctx) {
            exprType.put(ctx, Type.BOOLEAN);
        }

        @Override
        public void exitAddExpr(AddExprContext ctx) {
            Type lt = exprType.get(ctx.l);
            Type rt = exprType.get(ctx.r);

            if (lt.equals(Type.STRING) || rt.equals(Type.STRING)) {
                exprType.put(ctx, Type.STRING);
            } else {
                if (lt.equals(Type.REAL) && rt.equals(Type.REAL)) {
                    exprType.put(ctx, Type.REAL);
                }
            }
        }

        @Override
        public void exitSubExpr(SubExprContext ctx) {
            Type lt = exprType.get(ctx.l);
            Type rt = exprType.get(ctx.r);

            if (lt.equals(Type.REAL) && rt.equals(Type.REAL)) {
                exprType.put(ctx, Type.REAL);
            }

        }

        @Override
        public void exitDivExpr(DivExprContext ctx) {
            Type lt = exprType.get(ctx.l);
            Type rt = exprType.get(ctx.r);

            if (lt.equals(Type.REAL) && rt.equals(Type.REAL)) {
                exprType.put(ctx, Type.REAL);
            }
        }

        @Override
        public void exitMulExpr(MulExprContext ctx) {
            Type lt = exprType.get(ctx.l);
            Type rt = exprType.get(ctx.r);

            if (lt.equals(Type.REAL) && rt.equals(Type.REAL)) {
                exprType.put(ctx, Type.REAL);
            }
        }

        @Override
        public void exitAndExpr(AndExprContext ctx) {
            Type lt = exprType.get(ctx.l);
            Type rt = exprType.get(ctx.r);

            if (lt.equals(Type.BOOLEAN) && rt.equals(Type.BOOLEAN)) {
                exprType.put(ctx, Type.REAL);
            } else {
                throw new RuntimeException("Error at line " + ctx.getStart().getLine() + ". Boolean operator on non boolean types");
            }
        }

        @Override
        public void exitOrExpr(OrExprContext ctx) {
            Type lt = exprType.get(ctx.l);
            Type rt = exprType.get(ctx.r);

            if (lt.equals(Type.BOOLEAN) && rt.equals(Type.BOOLEAN)) {
                exprType.put(ctx, Type.REAL);
            } else {
                throw new RuntimeException("Error at line " + ctx.getStart().getLine() + ". Boolean operator on non boolean types");
            }
        }

        @Override
        public void exitParenExpr(ParenExprContext ctx) {
            exprType.put(ctx, exprType.get(ctx.expr()));
        }

        @Override
        public void exitNeqExpr(NeqExprContext ctx) {
            exprType.put(ctx, Type.BOOLEAN);
        }

        @Override
        public void exitArrayLiteral(ArrayLiteralContext ctx) {
            exprType.put(ctx, Type.ARRAY);
        }

        //endregion


        @Override
        public void exitValue(ValueContext ctx) {
            exprType.put(ctx, exprType.get(ctx.getChild(0)));
        }

        @Override
        public void exitAssignment(AssignmentContext ctx) {
            types.put(ctx.id().getText(), exprType.get(ctx.value()));
        }


    }


}
