package ast;

import visitor.AstVisitor;

public class CssPropertyNode extends AstNode {
    private String propertyName;
    private boolean isVariable;

    public CssPropertyNode(String propertyName) {
        this.propertyName = propertyName;
        this.isVariable = false;
    }

    public CssPropertyNode(String propertyName, boolean isVariable) {
        this.propertyName = propertyName;
        this.isVariable = isVariable;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public boolean isVariable() {
        return isVariable;
    }

    public void setVariable(boolean variable) {
        isVariable = variable;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssProperty(this);
    }
}

