package ASTK;

import java.util.ArrayList;
import java.util.List;

public class BlockNode extends ASTNode {

    public List<StatementNode> statements = new ArrayList<>();

    public BlockNode(int LineNumber) {
        super("Block", LineNumber);
    }

    @Override
    public void print(String indent) {
        for (StatementNode stmt : statements) {
            if (stmt != null) {
                stmt.print(indent);
            }
        }
    }
}
