package ast;

import visitor.AstVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents CSS selectors (can be complex with combinators).
 * Simplified to store combinators as strings directly instead of CssCombinatorNode wrappers.
 */
public class CssSelectorNode extends AstNode {
    private List<CssSimpleSelectorNode> simpleSelectors;
    private List<String> combinators; // " ", ">", "+", "~" - stored as strings directly

    public CssSelectorNode() {
        this.simpleSelectors = new ArrayList<>();
        this.combinators = new ArrayList<>();
    }

    public List<CssSimpleSelectorNode> getSimpleSelectors() {
        return simpleSelectors;
    }

    public void addSimpleSelector(CssSimpleSelectorNode selector) {
        if (selector != null) {
            simpleSelectors.add(selector);
        }
    }

    public List<String> getCombinators() {
        return combinators;
    }

    public void addCombinator(String combinator) {
        if (combinator != null) {
            combinators.add(combinator);
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssSelector(this);
    }
}
