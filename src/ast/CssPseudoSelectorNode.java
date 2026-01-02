package ast;

import visitor.AstVisitor;

public class CssPseudoSelectorNode extends AstNode {
    private String pseudoName;
    private String pseudoExpression;

    public CssPseudoSelectorNode(String pseudoName) {
        this.pseudoName = pseudoName;
        this.pseudoExpression = null;
    }

    public CssPseudoSelectorNode(String pseudoName, String pseudoExpression) {
        this.pseudoName = pseudoName;
        this.pseudoExpression = pseudoExpression;
    }

    public String getPseudoName() {
        return pseudoName;
    }

    public void setPseudoName(String pseudoName) {
        this.pseudoName = pseudoName;
    }

    public String getPseudoExpression() {
        return pseudoExpression;
    }

    public void setPseudoExpression(String pseudoExpression) {
        this.pseudoExpression = pseudoExpression;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssPseudoSelector(this);
    }
}

