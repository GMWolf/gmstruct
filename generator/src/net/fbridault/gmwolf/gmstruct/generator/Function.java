package net.fbridault.gmwolf.gmstruct.generator;

import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructBaseListener;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructBaseVisitor;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructLexer;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.FunctionContext;
import net.fbridault.gmwolf.gmstruct.generator.type.StructType;
import net.fbridault.gmwolf.gmstruct.generator.type.Type;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileNotFoundException;
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
        if (context.idList() != null) {
            for (IdContext id : context.idList().id()) {
                args.add(id.getText());
                script.addParameter(id.getText(), "");
            }
        }

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new StaticAnalyzer(), context.block());

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


    class StaticAnalyzer extends GMStructBaseListener {

        ExprTypeVisitor typeVisitor = new ExprTypeVisitor();

        Map<String, Type> varTypes = new HashMap<>();

        @Override
        public void exitDeclaration(DeclarationContext ctx) {
            if (varTypes.containsKey(ctx.name.getText())) {
                throw new GMSException(ctx, "Variable name already defined");
            }


            if (ctx.type != null) {
                Type t = Type.get(struct.getNameSpace(), ctx.type.getText());
                varTypes.put(ctx.name.getText(), t);
                Type exprType = typeVisitor.visit(ctx.expr());
                if (!exprType.assignsTo(t)) {
                    throw new GMSException(ctx, "Cannot assign " + exprType + " to " + t + ".");
                }
            } else {
                varTypes.put(ctx.name.getText(), typeVisitor.visit(ctx.expr()));
            }
        }

        @Override
        public void exitAssignment(AssignmentContext ctx) {
            if (!varTypes.containsKey(ctx.id().getText())) {
                throw new GMSException(ctx, "Unknown variable " + ctx.id().getText() + ".");
            }

            Type varType = varTypes.get(ctx.id().getText());
            Type exprType = typeVisitor.visit(ctx.value());
            if (!exprType.assignsTo(varType)) {
                throw new GMSException(ctx, "Cannot assign " + exprType + " to " + varType + ".");
            }
        }



        class ExprTypeVisitor extends GMStructBaseVisitor<Type> {

            Type typeContext = null;

            @Override
            public Type visitDotExpr(DotExprContext ctx) {
                typeContext = visit(ctx.l);
                Type type =  visit(ctx.r);
                typeContext = null;
                return type;
            }

            //region value

            @Override
            public Type visitValNum(ValNumContext ctx) {
                return Type.REAL;
            }

            @Override
            public Type visitValVar(ValVarContext ctx) {
                if (typeContext != null) {
                    Struct structContext = ((StructType) typeContext).getStruct();
                    if (structContext.hasAttribute(ctx.id().getText())) {
                        return structContext.getAttribute(ctx.id().getText()).getType();
                    } else {
                        throw new GMSException(ctx, "Unknown attribute " + struct.getName() + "." + ctx.id().getText());
                    }
                }

                if (varTypes.containsKey(ctx.id().getText())) {
                    return varTypes.get(ctx.id().getText());
                } else {
                    throw new GMSException(ctx, "Unknown variable " + ctx.id().getText());
                }
            }

            @Override
            public Type visitValStr(ValStrContext ctx) {
                return Type.STRING;
            }

            @Override
            public Type visitValFunction(ValFunctionContext ctx) {

                Struct structContext = typeContext == null ? StructType.get(struct).getStruct() : ((StructType) typeContext).getStruct();
                if (structContext.hasFunction(ctx.functionCall().name.getText())) {
                    return structContext.getFunction(ctx.functionCall().name.getText()).type;
                }
                throw new GMSException(ctx, "Unknown function " + typeContext + "." + ctx.functionCall().name.getText());
            }

            @Override
            public Type visitValArray(ValArrayContext ctx) {
                return Type.ARRAY;
            }

            @Override
            public Type visitValConstruct(ValConstructContext ctx) {
                return Type.get(struct.getNameSpace(), ctx.constructor().id().getText());
            }



            //endregion

            @Override
            public Type visitValExpr(ValExprContext ctx) {
                return visit(ctx.value());
            }

            @Override
            public Type visitNum(NumContext ctx) {
                return Type.REAL;
            }

            @Override
            public Type visitStr(StrContext ctx) {
                return Type.STRING;
            }

            @Override
            public Type visitId(IdContext ctx) {
                return super.visitId(ctx);
            }

            @Override
            public Type visitFunctionCall(FunctionCallContext ctx) {
                if (!struct.hasFunction(name)) {
                    throw new RuntimeException("Unknown function " + ctx.name.getText());
                }

               return struct.getFunction(ctx.name.getText()).type;
            }

            @Override
            public Type visitEqExpr(EqExprContext ctx) {
                return Type.BOOLEAN;
            }

            @Override
            public Type visitAddExpr(AddExprContext ctx) {
                Type lt = visit(ctx.l);
                Type rt = visit(ctx.r);

                return lt.getTypeAdd(rt);
            }

            @Override
            public Type visitSubExpr(SubExprContext ctx) {
                Type lt = visit(ctx.l);
                Type rt = visit(ctx.r);

                return lt.getTypeSub(rt);

            }

            @Override
            public Type visitDivExpr(DivExprContext ctx) {
                Type lt = visit(ctx.l);
                Type rt = visit(ctx.r);

                return lt.getTypeDiv(rt);
            }

            @Override
            public Type visitMulExpr(MulExprContext ctx) {
                Type lt = visit(ctx.l);
                Type rt = visit(ctx.r);

                Type t = lt.getTypeMul(rt);
                if (t == null ) {
                    throw new GMSException(ctx, "Cannot use Multiply operator on " + lt + " and " + rt);
                }
                return t;
            }

            @Override
            public Type visitAndExpr(AndExprContext ctx) {
                Type lt = visit(ctx.l);
                Type rt = visit(ctx.r);

                if (lt.equals(Type.BOOLEAN) && rt.equals(Type.BOOLEAN)) {
                    return  Type.REAL;
                } else {
                    throw new GMSException(ctx, ". Boolean operator on non boolean varTypes");
                }
            }

            @Override
            public Type visitOrExpr(OrExprContext ctx) {
                Type lt = visit(ctx.l);
                Type rt = visit(ctx.r);

                if (lt.equals(Type.BOOLEAN) && rt.equals(Type.BOOLEAN)) {
                    return Type.BOOLEAN;
                } else {
                    throw new GMSException(ctx, "Boolean operator on non boolean varTypes.");
                }
            }

            @Override
            public Type visitParenExpr(ParenExprContext ctx) {
                return visit(ctx.expr());
            }

            @Override
            public Type visitNeqExpr(NeqExprContext ctx) {
                return Type.BOOLEAN;
            }

            @Override
            public Type visitArrayLiteral(ArrayLiteralContext ctx) {
               return Type.ARRAY;
            }
        }
    }


}
