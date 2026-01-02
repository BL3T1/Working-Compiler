package ast;

import visitor.AstVisitor;
import java.util.List;
import java.util.ArrayList;

public class CssRuleNode extends AstNode {
    private CssSelectorNode selector;
    private List<CssDeclarationNode> declarations;

    public CssRuleNode(CssSelectorNode selector) {
        this.selector = selector;
        this.declarations = new ArrayList<>();
    }

    public CssSelectorNode getSelector() {
        return selector;
    }

    public void setSelector(CssSelectorNode selector) {
        this.selector = selector;
    }

    public List<CssDeclarationNode> getDeclarations() {
        return declarations;
    }

    public void addDeclaration(CssDeclarationNode declaration) {
        if (declaration != null) {
            declarations.add(declaration);
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssRule(this);
    }
}
