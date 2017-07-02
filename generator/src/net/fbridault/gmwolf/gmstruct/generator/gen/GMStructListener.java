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
	 * Enter a parse tree produced by {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GMStructParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMStructParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GMStructParser.ValueContext ctx);
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