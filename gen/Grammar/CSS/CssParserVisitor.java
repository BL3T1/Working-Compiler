// Generated from src/Grammar/CSS/CssParser.g4 by ANTLR 4.13.2
package Grammar.CSS;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CssParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(CssParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(CssParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSelectorWithType}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelectorWithType(CssParser.SimpleSelectorWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSelectorModifiersOnly}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelectorModifiersOnly(CssParser.SimpleSelectorModifiersOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(CssParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversal(CssParser.UniversalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(CssParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribWithValue}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribWithValue(CssParser.AttribWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribWithoutValue}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribWithoutValue(CssParser.AttribWithoutValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoClass}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClass(CssParser.PseudoClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoElement}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoElement(CssParser.PseudoElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notPseudo}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotPseudo(CssParser.NotPseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#pseudoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoExpr(CssParser.PseudoExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildCombinator(CssParser.ChildCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code adjacentSiblingCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjacentSiblingCombinator(CssParser.AdjacentSiblingCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generalSiblingCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralSiblingCombinator(CssParser.GeneralSiblingCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identProperty}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentProperty(CssParser.IdentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varProperty}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarProperty(CssParser.VarPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CssParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentValue(CssParser.IdentValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarValue(CssParser.VarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(CssParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(CssParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashValue(CssParser.HashValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importantValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportantValue(CssParser.ImportantValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code urlValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlValue(CssParser.UrlValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenValue(CssParser.ParenValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaValue(CssParser.CommaValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotValue(CssParser.DotValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colonValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonValue(CssParser.ColonValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code slashValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashValue(CssParser.SlashValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterValue(CssParser.GreaterValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusValue(CssParser.PlusValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusValue(CssParser.MinusValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarValue(CssParser.StarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tildeValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildeValue(CssParser.TildeValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsValue(CssParser.EqualsValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionValue(CssParser.QuestionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRule(CssParser.AtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleWithBlock}
	 * labeled alternative in {@link CssParser#atRuleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleWithBlock(CssParser.AtRuleWithBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleWithoutBlock}
	 * labeled alternative in {@link CssParser#atRuleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleWithoutBlock(CssParser.AtRuleWithoutBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleIdent}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleIdent(CssParser.AtRuleIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleVar}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleVar(CssParser.AtRuleVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleString}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleString(CssParser.AtRuleStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleNumber}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleNumber(CssParser.AtRuleNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleHash}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleHash(CssParser.AtRuleHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleComma}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleComma(CssParser.AtRuleCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleLParen}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleLParen(CssParser.AtRuleLParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleRParen}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleRParen(CssParser.AtRuleRParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleColon}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleColon(CssParser.AtRuleColonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleUrl}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleUrl(CssParser.AtRuleUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleGreater}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleGreater(CssParser.AtRuleGreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRulePlus}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRulePlus(CssParser.AtRulePlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleTilde}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleTilde(CssParser.AtRuleTildeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleSlash}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleSlash(CssParser.AtRuleSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleDot}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleDot(CssParser.AtRuleDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleEquals}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleEquals(CssParser.AtRuleEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleMinus}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleMinus(CssParser.AtRuleMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleStar}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleStar(CssParser.AtRuleStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleAnd}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleAnd(CssParser.AtRuleAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleQuestion}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleQuestion(CssParser.AtRuleQuestionContext ctx);
}