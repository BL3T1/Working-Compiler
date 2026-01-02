package ast;

import visitor.AstVisitor;

public class CssDeclarationNode extends AstNode {
    private CssPropertyNode property;
    private CssValueNode value;
    private boolean important;

    public CssDeclarationNode(CssPropertyNode property, CssValueNode value) {
        this.property = property;
        this.value = value;
        this.important = false;
    }

    public CssPropertyNode getProperty() {
        return property;
    }

    public void setProperty(CssPropertyNode property) {
        this.property = property;
    }

    public CssValueNode getValue() {
        return value;
    }

    public void setValue(CssValueNode value) {
        this.value = value;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssDeclaration(this);
    }
}
