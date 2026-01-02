package ast;

import visitor.AstVisitor;

public class CssUniversalSelectorNode extends AstNode {
    @Override
    @SuppressWarnings("deprecation")
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssUniversalSelector(this);
    }
}

