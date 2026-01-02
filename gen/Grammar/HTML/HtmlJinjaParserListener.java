// Generated from src/Grammar/HTML/HtmlJinjaParser.g4 by ANTLR 4.13.2
package Grammar.HTML;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlJinjaParser}.
 */
public interface HtmlJinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(HtmlJinjaParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(HtmlJinjaParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HtmlJinjaParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HtmlJinjaParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterVoidElement(HtmlJinjaParser.VoidElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitVoidElement(HtmlJinjaParser.VoidElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagElementWithContent}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTagElementWithContent(HtmlJinjaParser.TagElementWithContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagElementWithContent}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTagElementWithContent(HtmlJinjaParser.TagElementWithContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagElementEmpty}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTagElementEmpty(HtmlJinjaParser.TagElementEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagElementEmpty}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTagElementEmpty(HtmlJinjaParser.TagElementEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(HtmlJinjaParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(HtmlJinjaParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scriptElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterScriptElement(HtmlJinjaParser.ScriptElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitScriptElement(HtmlJinjaParser.ScriptElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(HtmlJinjaParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleElement}
	 * labeled alternative in {@link HtmlJinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(HtmlJinjaParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularTag}
	 * labeled alternative in {@link HtmlJinjaParser#tagOpen}.
	 * @param ctx the parse tree
	 */
	void enterRegularTag(HtmlJinjaParser.RegularTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularTag}
	 * labeled alternative in {@link HtmlJinjaParser#tagOpen}.
	 * @param ctx the parse tree
	 */
	void exitRegularTag(HtmlJinjaParser.RegularTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code linkTag}
	 * labeled alternative in {@link HtmlJinjaParser#tagOpen}.
	 * @param ctx the parse tree
	 */
	void enterLinkTag(HtmlJinjaParser.LinkTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code linkTag}
	 * labeled alternative in {@link HtmlJinjaParser#tagOpen}.
	 * @param ctx the parse tree
	 */
	void exitLinkTag(HtmlJinjaParser.LinkTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#tagClose}.
	 * @param ctx the parse tree
	 */
	void enterTagClose(HtmlJinjaParser.TagCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#tagClose}.
	 * @param ctx the parse tree
	 */
	void exitTagClose(HtmlJinjaParser.TagCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularSelfClosing}
	 * labeled alternative in {@link HtmlJinjaParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterRegularSelfClosing(HtmlJinjaParser.RegularSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularSelfClosing}
	 * labeled alternative in {@link HtmlJinjaParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitRegularSelfClosing(HtmlJinjaParser.RegularSelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code linkSelfClosing}
	 * labeled alternative in {@link HtmlJinjaParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterLinkSelfClosing(HtmlJinjaParser.LinkSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code linkSelfClosing}
	 * labeled alternative in {@link HtmlJinjaParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitLinkSelfClosing(HtmlJinjaParser.LinkSelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularVoidTag}
	 * labeled alternative in {@link HtmlJinjaParser#voidTag}.
	 * @param ctx the parse tree
	 */
	void enterRegularVoidTag(HtmlJinjaParser.RegularVoidTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularVoidTag}
	 * labeled alternative in {@link HtmlJinjaParser#voidTag}.
	 * @param ctx the parse tree
	 */
	void exitRegularVoidTag(HtmlJinjaParser.RegularVoidTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code linkVoidTag}
	 * labeled alternative in {@link HtmlJinjaParser#voidTag}.
	 * @param ctx the parse tree
	 */
	void enterLinkVoidTag(HtmlJinjaParser.LinkVoidTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code linkVoidTag}
	 * labeled alternative in {@link HtmlJinjaParser#voidTag}.
	 * @param ctx the parse tree
	 */
	void exitLinkVoidTag(HtmlJinjaParser.LinkVoidTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#scriptTag}.
	 * @param ctx the parse tree
	 */
	void enterScriptTag(HtmlJinjaParser.ScriptTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#scriptTag}.
	 * @param ctx the parse tree
	 */
	void exitScriptTag(HtmlJinjaParser.ScriptTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#scriptContent}.
	 * @param ctx the parse tree
	 */
	void enterScriptContent(HtmlJinjaParser.ScriptContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#scriptContent}.
	 * @param ctx the parse tree
	 */
	void exitScriptContent(HtmlJinjaParser.ScriptContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#scriptContentText}.
	 * @param ctx the parse tree
	 */
	void enterScriptContentText(HtmlJinjaParser.ScriptContentTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#scriptContentText}.
	 * @param ctx the parse tree
	 */
	void exitScriptContentText(HtmlJinjaParser.ScriptContentTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#styleTag}.
	 * @param ctx the parse tree
	 */
	void enterStyleTag(HtmlJinjaParser.StyleTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#styleTag}.
	 * @param ctx the parse tree
	 */
	void exitStyleTag(HtmlJinjaParser.StyleTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void enterStyleContent(HtmlJinjaParser.StyleContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void exitStyleContent(HtmlJinjaParser.StyleContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#styleContentText}.
	 * @param ctx the parse tree
	 */
	void enterStyleContentText(HtmlJinjaParser.StyleContentTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#styleContentText}.
	 * @param ctx the parse tree
	 */
	void exitStyleContentText(HtmlJinjaParser.StyleContentTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#tagContent}.
	 * @param ctx the parse tree
	 */
	void enterTagContent(HtmlJinjaParser.TagContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#tagContent}.
	 * @param ctx the parse tree
	 */
	void exitTagContent(HtmlJinjaParser.TagContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrWithValue}
	 * labeled alternative in {@link HtmlJinjaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttrWithValue(HtmlJinjaParser.AttrWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrWithValue}
	 * labeled alternative in {@link HtmlJinjaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttrWithValue(HtmlJinjaParser.AttrWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrWithoutValue}
	 * labeled alternative in {@link HtmlJinjaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttrWithoutValue(HtmlJinjaParser.AttrWithoutValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrWithoutValue}
	 * labeled alternative in {@link HtmlJinjaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttrWithoutValue(HtmlJinjaParser.AttrWithoutValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scriptAttrWithValue}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttribute}.
	 * @param ctx the parse tree
	 */
	void enterScriptAttrWithValue(HtmlJinjaParser.ScriptAttrWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptAttrWithValue}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttribute}.
	 * @param ctx the parse tree
	 */
	void exitScriptAttrWithValue(HtmlJinjaParser.ScriptAttrWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scriptAttrWithoutValue}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttribute}.
	 * @param ctx the parse tree
	 */
	void enterScriptAttrWithoutValue(HtmlJinjaParser.ScriptAttrWithoutValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptAttrWithoutValue}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttribute}.
	 * @param ctx the parse tree
	 */
	void exitScriptAttrWithoutValue(HtmlJinjaParser.ScriptAttrWithoutValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scriptAttrValueDouble}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttrValue}.
	 * @param ctx the parse tree
	 */
	void enterScriptAttrValueDouble(HtmlJinjaParser.ScriptAttrValueDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptAttrValueDouble}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttrValue}.
	 * @param ctx the parse tree
	 */
	void exitScriptAttrValueDouble(HtmlJinjaParser.ScriptAttrValueDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scriptAttrValueSingle}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttrValue}.
	 * @param ctx the parse tree
	 */
	void enterScriptAttrValueSingle(HtmlJinjaParser.ScriptAttrValueSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptAttrValueSingle}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttrValue}.
	 * @param ctx the parse tree
	 */
	void exitScriptAttrValueSingle(HtmlJinjaParser.ScriptAttrValueSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scriptAttrValueUnquoted}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttrValue}.
	 * @param ctx the parse tree
	 */
	void enterScriptAttrValueUnquoted(HtmlJinjaParser.ScriptAttrValueUnquotedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptAttrValueUnquoted}
	 * labeled alternative in {@link HtmlJinjaParser#scriptAttrValue}.
	 * @param ctx the parse tree
	 */
	void exitScriptAttrValueUnquoted(HtmlJinjaParser.ScriptAttrValueUnquotedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#scriptAttrValueContent}.
	 * @param ctx the parse tree
	 */
	void enterScriptAttrValueContent(HtmlJinjaParser.ScriptAttrValueContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#scriptAttrValueContent}.
	 * @param ctx the parse tree
	 */
	void exitScriptAttrValueContent(HtmlJinjaParser.ScriptAttrValueContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#scriptAttrValueContentSingle}.
	 * @param ctx the parse tree
	 */
	void enterScriptAttrValueContentSingle(HtmlJinjaParser.ScriptAttrValueContentSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#scriptAttrValueContentSingle}.
	 * @param ctx the parse tree
	 */
	void exitScriptAttrValueContentSingle(HtmlJinjaParser.ScriptAttrValueContentSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleAttrWithValue}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttrWithValue(HtmlJinjaParser.StyleAttrWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleAttrWithValue}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttrWithValue(HtmlJinjaParser.StyleAttrWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleAttrWithoutValue}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttrWithoutValue(HtmlJinjaParser.StyleAttrWithoutValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleAttrWithoutValue}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttrWithoutValue(HtmlJinjaParser.StyleAttrWithoutValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleAttrValueDouble}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttrValue}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttrValueDouble(HtmlJinjaParser.StyleAttrValueDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleAttrValueDouble}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttrValue}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttrValueDouble(HtmlJinjaParser.StyleAttrValueDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleAttrValueSingle}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttrValue}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttrValueSingle(HtmlJinjaParser.StyleAttrValueSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleAttrValueSingle}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttrValue}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttrValueSingle(HtmlJinjaParser.StyleAttrValueSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleAttrValueUnquoted}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttrValue}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttrValueUnquoted(HtmlJinjaParser.StyleAttrValueUnquotedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleAttrValueUnquoted}
	 * labeled alternative in {@link HtmlJinjaParser#styleAttrValue}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttrValueUnquoted(HtmlJinjaParser.StyleAttrValueUnquotedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#styleAttrValueContent}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttrValueContent(HtmlJinjaParser.StyleAttrValueContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#styleAttrValueContent}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttrValueContent(HtmlJinjaParser.StyleAttrValueContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#styleAttrValueContentSingle}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttrValueContentSingle(HtmlJinjaParser.StyleAttrValueContentSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#styleAttrValueContentSingle}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttrValueContentSingle(HtmlJinjaParser.StyleAttrValueContentSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(HtmlJinjaParser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(HtmlJinjaParser.HtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpr(HtmlJinjaParser.JinjaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpr(HtmlJinjaParser.JinjaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStmt(HtmlJinjaParser.JinjaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStmt(HtmlJinjaParser.JinjaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void enterJinjaComment(HtmlJinjaParser.JinjaCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void exitJinjaComment(HtmlJinjaParser.JinjaCommentContext ctx);
}