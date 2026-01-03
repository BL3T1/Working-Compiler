package ASTK;

import java.util.ArrayList;
import java.util.List;

public class AccessNode extends ExpressionNode {

    public ExpressionNode base;
    public String operation; // "MEMBER", "INDEX", "CALL"
    public String identifier; // for member access
    public List<ExpressionNode> args; // for calls

    public AccessNode(ExpressionNode base, String op, int line) {
        super("AccessNode", line);
        this.base = base;
        this.operation = op;
        this.args = new ArrayList<>();
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + operation + (identifier != null ? ": " + identifier : ""));
        if (base != null) {
            System.out.println(indent + "  Base: ");
            base.print(indent + "    ");
        }

        // ADD THIS PART TO SEE YOUR ARGUMENTS:
        if (!args.isEmpty()) {
            System.out.println(indent + "  Args:");
            for (ExpressionNode arg : args) {
                arg.print(indent + "    ");
            }
        }
    }
}
