// Generated from D:/Projects/Java/GMStruct/generator/src/net/fbridault/gmwolf/gmstruct/generator\GMStruct.g4 by ANTLR 4.7
package net.fbridault.gmwolf.gmstruct.generator.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GMStructParser}.
 */
public interface GMStructListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GMStructParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GMStructParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GMStructParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#nameSpace}.
	 * @param ctx the parse tree
	 */
	void enterNameSpace(GMStructParser.NameSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#nameSpace}.
	 * @param ctx the parse tree
	 */
	void exitNameSpace(GMStructParser.NameSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#includeList}.
	 * @param ctx the parse tree
	 */
	void enterIncludeList(GMStructParser.IncludeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#includeList}.
	 * @param ctx the parse tree
	 */
	void exitIncludeList(GMStructParser.IncludeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(GMStructParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(GMStructParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(GMStructParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(GMStructParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(GMStructParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(GMStructParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(GMStructParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(GMStructParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#funtionList}.
	 * @param ctx the parse tree
	 */
	void enterFuntionList(GMStructParser.FuntionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#funtionList}.
	 * @param ctx the parse tree
	 */
	void exitFuntionList(GMStructParser.FuntionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GMStructParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GMStructParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(GMStructParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(GMStructParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GMStructParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GMStructParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(GMStructParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(GMStructParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(GMStructParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(GMStructParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GMStructParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GMStructParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GMStructParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GMStructParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDot}
	 * labeled alternative in {@link GMStructParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVarDot(GMStructParser.VarDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDot}
	 * labeled alternative in {@link GMStructParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVarDot(GMStructParser.VarDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varArray}
	 * labeled alternative in {@link GMStructParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVarArray(GMStructParser.VarArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varArray}
	 * labeled alternative in {@link GMStructParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVarArray(GMStructParser.VarArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varId}
	 * labeled alternative in {@link GMStructParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVarId(GMStructParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varId}
	 * labeled alternative in {@link GMStructParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVarId(GMStructParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GMStructParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GMStructParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GMStructParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GMStructParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(GMStructParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(GMStructParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(GMStructParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(GMStructParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(GMStructParser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(GMStructParser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(GMStructParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(GMStructParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(GMStructParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(GMStructParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(GMStructParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(GMStructParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(GMStructParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(GMStructParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(GMStructParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(GMStructParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(GMStructParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(GMStructParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(GMStructParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(GMStructParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValExpr(GMStructParser.ValExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValExpr(GMStructParser.ValExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(GMStructParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(GMStructParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(GMStructParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(GMStructParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neqExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeqExpr(GMStructParser.NeqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neqExpr}
	 * labeled alternative in {@link GMStructParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeqExpr(GMStructParser.NeqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(GMStructParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(GMStructParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valNum}
	 * labeled alternative in {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValNum(GMStructParser.ValNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valNum}
	 * labeled alternative in {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValNum(GMStructParser.ValNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valVar}
	 * labeled alternative in {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValVar(GMStructParser.ValVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valVar}
	 * labeled alternative in {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValVar(GMStructParser.ValVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valStr}
	 * labeled alternative in {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValStr(GMStructParser.ValStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valStr}
	 * labeled alternative in {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValStr(GMStructParser.ValStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valArray}
	 * labeled alternative in {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValArray(GMStructParser.ValArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valArray}
	 * labeled alternative in {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValArray(GMStructParser.ValArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valConstruct}
	 * labeled alternative in {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValConstruct(GMStructParser.ValConstructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valConstruct}
	 * labeled alternative in {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValConstruct(GMStructParser.ValConstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(GMStructParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(GMStructParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GMStructParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GMStructParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(GMStructParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(GMStructParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(GMStructParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(GMStructParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMStructParser#structPath}.
	 * @param ctx the parse tree
	 */
	void enterStructPath(GMStructParser.StructPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#structPath}.
	 * @param ctx the parse tree
	 */
	void exitStructPath(GMStructParser.StructPathContext ctx);
}