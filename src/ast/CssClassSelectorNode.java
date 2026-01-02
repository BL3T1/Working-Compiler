package ast;

import visitor.AstVisitor;

public class CssClassSelectorNode extends AstNode {
    private String className;

    public CssClassSelectorNode(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    @SuppressWarnings("deprecation")
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssClassSelector(this);
    }
}

