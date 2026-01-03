package AST;

public class ControlFlowNode extends StatementNode{

    public String iteratorVar;
    public ExpressionNode condition;
    public BlockNode body;
    public BlockNode elseBody;

    public ControlFlowNode(String type, ExpressionNode cond, BlockNode body, int line) {
        super(type, line);
        this.condition = cond;
        this.body = body;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + NodeName);
        condition.print(indent + "  Cond/Iter: ");
        body.print(indent + "  Body: ");
        if (elseBody != null) elseBody.print(indent + "  Else: ");
    }
}
