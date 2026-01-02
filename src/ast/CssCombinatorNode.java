package ast;

import visitor.AstVisitor;

public class CssCombinatorNode extends AstNode {
    private String combinator; // " ", ">", "+", "~"

    public CssCombinatorNode(String combinator) {
        this.combinator = combinator;
    }

    public String getCombinator() {
        return combinator;
    }

    public void setCombinator(String combinator) {
        this.combinator = combinator;
    }

    @Override
    @SuppressWarnings("deprecation")
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssCombinator(this);
    }
}

