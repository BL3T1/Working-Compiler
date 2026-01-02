// Generated from src/Grammar/HTML/HtmlJinjaParser.g4 by ANTLR 4.13.2
package Grammar.HTML;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlJinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlJinjaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(HtmlJinjaParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HtmlJinjaParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidElement(HtmlJinjaParser.VoidElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagElementWithContent}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagElementWithContent(HtmlJinjaParser.TagElementWithContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagElementEmpty}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagElementEmpty(HtmlJinjaParser.TagElementEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(HtmlJinjaParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scriptElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptElement(HtmlJinjaParser.ScriptElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(HtmlJinjaParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularTag}
	 * labeled alternative in {@link HtmlJinjaParser#tagOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularTag(HtmlJinjaParser.RegularTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code linkTag}
	 * labeled alternative in {@link HtmlJinjaParser#tagOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkTag(HtmlJinjaParser.LinkTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#tagClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagClose(HtmlJinjaParser.TagCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularSelfClosing}
	 * labeled alternative in {@link HtmlJinjaParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularSelfClosing(HtmlJinjaParser.RegularSelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code linkSelfClosing}
	 * labeled alternative in {@link HtmlJinjaParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkSelfClosing(HtmlJinjaParser.LinkSelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularVoidTag}
	 * labeled alternative in {@link HtmlJinjaParser#voidTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularVoidTag(HtmlJinjaParser.RegularVoidTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code linkVoidTag}
	 * labeled alternative in {@link HtmlJinjaParser#voidTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkVoidTag(HtmlJinjaParser.LinkVoidTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#scriptTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptTag(HtmlJinjaParser.ScriptTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#scriptContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptContent(HtmlJinjaParser.ScriptContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#scriptContentText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptContentText(HtmlJinjaParser.ScriptContentTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#styleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleTag(HtmlJinjaParser.StyleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#styleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleContent(HtmlJinjaParser.StyleContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#styleContentText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleContentText(HtmlJinjaParser.StyleContentTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#tagContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagContent(HtmlJinjaParser.TagContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrWithValue}
	 * labeled alternative in {@link HtmlJinjaParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrWithValue(HtmlJinjaParser.AttrWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrWithoutValue}
	 * labeled alternative in {@link HtmlJinjaParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrWithoutValue(HtmlJinjaParser.AttrWithoutValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scriptAttrWithValue}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptAttrWithValue(HtmlJinjaParser.ScriptAttrWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scriptAttrWithoutValue}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptAttrWithoutValue(HtmlJinjaParser.ScriptAttrWithoutValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scriptAttrValueDouble}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptAttrValueDouble(HtmlJinjaParser.ScriptAttrValueDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scriptAttrValueSingle}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptAttrValueSingle(HtmlJinjaParser.ScriptAttrValueSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scriptAttrValueUnquoted}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptAttrValueUnquoted(HtmlJinjaParser.ScriptAttrValueUnquotedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#scriptAttrValueContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptAttrValueContent(HtmlJinjaParser.ScriptAttrValueContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#scriptAttrValueContentSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptAttrValueContentSingle(HtmlJinjaParser.ScriptAttrValueContentSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleAttrWithValue}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttrWithValue(HtmlJinjaParser.StyleAttrWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleAttrWithoutValue}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttrWithoutValue(HtmlJinjaParser.StyleAttrWithoutValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleAttrValueDouble}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttrValueDouble(HtmlJinjaParser.StyleAttrValueDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleAttrValueSingle}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttrValueSingle(HtmlJinjaParser.StyleAttrValueSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleAttrValueUnquoted}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttrValueUnquoted(HtmlJinjaParser.StyleAttrValueUnquotedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#styleAttrValueContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttrValueContent(HtmlJinjaParser.StyleAttrValueContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#styleAttrValueContentSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttrValueContentSingle(HtmlJinjaParser.StyleAttrValueContentSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(HtmlJinjaParser.HtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#jinjaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpr(HtmlJinjaParser.JinjaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#jinjaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStmt(HtmlJinjaParser.JinjaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#jinjaComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaComment(HtmlJinjaParser.JinjaCommentContext ctx);
}