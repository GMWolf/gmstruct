package net.fbridault.gmwolf.gmstruct.generator;

import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructBaseListener;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser;
import net.fbridault.gmwolf.gmstruct.generator.gen.GMStructParser.FunctionContext;
import net.fbridault.gmwolf.gmstruct.generator.ir.Script;
import net.fbridault.gmwolf.gmstruct.generator.type.StructType;
import net.fbridault.gmwolf.gmstruct.generator.type.Type;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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

        //walker.walk(new ScriptWriter(script), context.block());

        return script;
    }

    class ScriptWriter extends GMStructBaseListener {
        Script script;
        ParserRuleContext block;

        ParseTreeProperty<String> gml;

        public ScriptWriter(Script script) {
            this.script = script;
            block = null;
        }

        @Override
        public void exitDeclaration(DeclarationContext ctx) {
            script.append(ctx.name).append("=").append(gml.get(ctx));
        }

        @Override
        public void exitValNum(ValNumContext ctx) {
            gml.put(ctx, ctx.getText());
        }

        @Override
        public void exitValVar(ValVarContext ctx) {
            gml.put(ctx, ctx.getText());
        }

        @Override
        public void exitValStr(ValStrContext ctx) {
            gml.put(ctx, ctx.getText());
        }

        @Override
        public void exitValExpr(ValExprContext ctx) {
            gml.put(ctx, gml.get(ctx.value()));
        }


        /* @Override
        public void exitEveryRule(ParserRuleContext ctx) {
            if (block == ctx) {
                block = null;
            }
        }*/

       /* @Override
        public void visitTerminal(TerminalNode node) {
            if (block == null) {
                //Check for replacements id ID
                if (node.getSymbol().getType() == GMStructLexer.ID) {
                    if (struct.hasAttribute(node.getText())) { //is a struct attribute
                        script.append("argument0[").append(struct.getAttributePos(node.getText()) + 1).append("]");
                    } else if (args.contains(node.getText())) {  //Is an argument?
                        script.append("argument").append(args.indexOf(node.getText()) + 1);
                    } else if (GML_VAR_NAMES.contains(node.getText())) { //is build int var?
                        script.append("_").append(node.getText());
                    } else {
                        script.append(node.getText());
                    }
                } else {
                    script.append(node.getText());
                }
            }
        }*/

        @Override
        public void exitStat(StatContext ctx) {
            script.append("\n");
        }
    }


    class StaticAnalyzer extends GMStructBaseListener {

        ParseTreeProperty<ParseTree> contextProperty = new ParseTreeProperty<>();
        Map<String, Type> varTypes = new HashMap<>();
        ParseTreeProperty<Type> types = new ParseTreeProperty<>();

        @Override
        public void exitDeclaration(DeclarationContext ctx) {
            if (varTypes.containsKey(ctx.name.getText())) {
                throw new GMSException(ctx, "Variable name already defined");
            }


            if (ctx.type != null) {
                Type t = Type.get(struct.getNameSpace(), ctx.type.getText());
                varTypes.put(ctx.name.getText(), t);
                Type exprType = types.get(ctx.expr());
                if (!exprType.assignsTo(t)) {
                    throw new GMSException(ctx, "Cannot assign " + exprType + " to " + t + ".");
                }
            } else {
                varTypes.put(ctx.name.getText(), types.get(ctx.expr()));
            }
        }

        @Override
        public void exitAssignment(AssignmentContext ctx) {

            Type varType = types.get(ctx.variable());
            Type exprType = types.get(ctx.expr());
            if (!exprType.assignsTo(varType)) {
                throw new GMSException(ctx, "Cannot assign " + exprType + " to " + varType + ".");
            }
        }

        @Override
        public void exitVarId(VarIdContext ctx) {
            if (!varTypes.containsKey(ctx.var().getText())) {
                throw new GMSException(ctx, "Unknown variable " + ctx.var().getText() + ".");
            }

            types.put(ctx, varTypes.get(ctx.var().getText()));
        }

        @Override
        public void exitVar(VarContext ctx) {

        }

        @Override
        public void enterVarDot(VarDotContext ctx) {
            contextProperty.put(ctx.id(), ctx.expr());
        }

        @Override
        public void exitVarDot(VarDotContext ctx) {
            super.exitVarDot(ctx);
        }

        @Override
        public void enterDotExpr(DotExprContext ctx) {
            contextProperty.put(ctx.r, ctx.l);
        }

        @Override
        public void exitDotExpr(DotExprContext ctx) {
            types.put(ctx, types.get(ctx.r));
        }

        @Override
        public void exitFuncExpr(FuncExprContext ctx) {

        }

        //region value

        @Override
        public void exitValNum(ValNumContext ctx) {
            types.put(ctx, Type.REAL);
        }

        @Override
        public void exitValVar(ValVarContext ctx) {
            String name = ctx.getText();
            ParseTree context = contextProperty.get(ctx);
            if (context != null) {
                Struct structContext = ((StructType) types.get(context)).getStruct();
                if (structContext.hasAttribute(ctx.id().getText())) {
                    Type type = structContext.getAttribute(name).getType();
                    types.put(ctx, type);
                } else {
                    throw new GMSException(ctx, "Unknown attribute " + struct.getName() + "." + ctx.id().getText());
                }
            } else if (varTypes.containsKey(ctx.id().getText())) {
                Type type = varTypes.get(ctx.id().getText());
                types.put(ctx, type);
            } else {
                throw new GMSException(ctx, "Unknown variable " + ctx.id().getText());
            }
        }

        @Override
        public void exitValStr(ValStrContext ctx) {
            types.put(ctx, Type.STRING);
        }

       /* @Override
        public void exitValFunction(ValFunctionContext ctx) {
            String name = ctx.functionCall().name.getText();
            Struct structContext = context == null ? StructType.get(struct).getStruct() : ((StructType) types.get(context)).getStruct();
            if (structContext.hasFunction(ctx.functionCall().name.getText())) {
                Type type = structContext.getFunction(name).type;
                types.put(ctx, type);
            }
            throw new GMSException(ctx, "Unknown function " + context + "." + ctx.functionCall().name.getText());
        }*/

        @Override
        public void exitValArray(ValArrayContext ctx) {
            types.put(ctx, Type.ARRAY);
        }

        @Override
        public void exitValConstruct(ValConstructContext ctx) {
            String name = ctx.constructor().id().getText();
            Type type = Type.get(struct.getNameSpace(), name);
            types.put(ctx, type);
        }



        //endregion

        @Override
        public void exitValExpr(ValExprContext ctx) {
            types.put(ctx, types.get(ctx.value()));
        }

        @Override
        public void exitNum(NumContext ctx) {
            types.put(ctx, Type.REAL);
        }

        @Override
        public void exitStr(StrContext ctx) {
            types.put(ctx, Type.STRING);
        }

        @Override
        public void exitId(IdContext ctx) {
            super.exitId(ctx);
        }

        @Override
        public void exitFunctionCall(FunctionCallContext ctx) {
            if (!struct.hasFunction(name)) {
                throw new RuntimeException("Unknown function " + ctx.name.getText());
            }
            Type type = struct.getFunction(ctx.name.getText()).type;
            types.put(ctx, type);
        }

        @Override
        public void exitEqExpr(EqExprContext ctx) {
            types.put(ctx, Type.BOOLEAN);
        }

        @Override
        public void exitAddExpr(AddExprContext ctx) {
            Type lt = types.get(ctx.l);
            Type rt = types.get(ctx.r);
            Type type = lt.getTypeAdd(rt);
            types.put(ctx, type);
        }

        @Override
        public void exitSubExpr(SubExprContext ctx) {
            Type lt = types.get(ctx.l);
            Type rt = types.get(ctx.r);
            types.put(ctx, lt.getTypeSub(rt));
        }

        @Override
        public void exitDivExpr(DivExprContext ctx) {
            Type lt = types.get(ctx.l);
            Type rt = types.get(ctx.r);
            types.put(ctx, lt.getTypeDiv(rt));
        }

        @Override
        public void exitMulExpr(MulExprContext ctx) {
            Type lt = types.get(ctx.l);
            Type rt = types.get(ctx.r);
            Type t = lt.getTypeMul(rt);
            if (t == null ) {
                throw new GMSException(ctx, "Cannot use Multiply operator on " + lt + " and " + rt);
            }
            types.put(ctx, t);
        }

        @Override
        public void exitAndExpr(AndExprContext ctx) {
            Type lt = types.get(ctx.l);
            Type rt = types.get(ctx.r);
            if (lt.equals(Type.BOOLEAN) && rt.equals(Type.BOOLEAN)) {
                types.put(ctx, Type.BOOLEAN);
            } else {
                throw new GMSException(ctx, ". Boolean operator on non boolean varTypes");
            }
        }

        @Override
        public void exitOrExpr(OrExprContext ctx) {
            Type lt = types.get(ctx.l);
            Type rt = types.get(ctx.r);
            if (lt.equals(Type.BOOLEAN) && rt.equals(Type.BOOLEAN)) {
                types.put(ctx, Type.BOOLEAN);
            } else {
                throw new GMSException(ctx, "Boolean operator on non boolean varTypes.");
            }
        }

        @Override
        public void exitParenExpr(ParenExprContext ctx) {
            types.put(ctx, types.get(ctx.expr()));
        }

        @Override
        public void exitNeqExpr(NeqExprContext ctx) {
            types.put(ctx, Type.BOOLEAN);
        }

        @Override
        public void exitArrayLiteral(ArrayLiteralContext ctx) {
            types.put(ctx, Type.ARRAY);
        }
    }


}
