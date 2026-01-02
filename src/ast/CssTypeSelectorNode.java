package ast;

import visitor.AstVisitor;

public class CssTypeSelectorNode extends AstNode {
    private String elementName;

    public CssTypeSelectorNode(String elementName) {
        this.elementName = elementName;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    @Override
    @SuppressWarnings("deprecation")
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssTypeSelector(this);
    }
}

