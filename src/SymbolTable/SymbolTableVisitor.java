package SymbolTable;

import ASTK.*;

public class SymbolTableVisitor {
    private Scope currentScope;

    public void build(ProgramNode root) {
        currentScope = new Scope("Global", null);
        for (ASTNode element : root.elements) {
            check(element);
        }
        currentScope.print();
    }

    private void check(ASTNode node) {
        if (node == null) return;


        if (node instanceof ProgramNode) {
            for (ASTNode element : ((ProgramNode) node).elements) {
                check(element);
            }
        } else if (node instanceof ClassNode) {
            ClassNode cls = (ClassNode) node;

            currentScope.define(new Symbol(cls.name, "CLASS", cls.LineNumber));


            Scope previous = currentScope;
            currentScope = new Scope("Class:" + cls.name, previous);

            check(cls.body);

            currentScope.print();
            currentScope = previous;
        } else if (node instanceof RouteNode) {
            RouteNode route = (RouteNode) node;

            check(route.function);
        } else if (node instanceof FunctionDefNode) {
            FunctionDefNode func = (FunctionDefNode) node;
            currentScope.define(new Symbol(func.name, "FUNCTION", func.LineNumber));

            Scope previous = currentScope;
            currentScope = new Scope("Func:" + func.name, previous);

            for (String p : func.parameters) {
                currentScope.define(new Symbol(p, "PARAM", func.LineNumber));
            }

            check(func.body);
            currentScope.print();
            currentScope = previous;
        } else if (node instanceof BlockNode) {
            for (StatementNode stmt : ((BlockNode) node).statements) {
                check(stmt);
            }
        } else if (node instanceof AssignmentNode) {
            AssignmentNode asn = (AssignmentNode) node;
            currentScope.define(new Symbol(asn.target, "VARIABLE", asn.LineNumber));
            check(asn.value);
        } else if (node instanceof ControlFlowNode) {
            ControlFlowNode cf = (ControlFlowNode) node;

            if (cf.NodeName.equals("ForLoop") && cf.iteratorVar != null) {

                currentScope.define(new Symbol(cf.iteratorVar, "ITERATOR", cf.LineNumber));
            }

            check(cf.condition);
            check(cf.body);
            if (cf.elseBody != null) check(cf.elseBody);
        } else if (node instanceof ExpressionStmtNode) {
            check(((ExpressionStmtNode) node).expression);
        } else if (node instanceof JumpNode) {
            check(((JumpNode) node).value);
        } else if (node instanceof AccessNode) {
            check(((AccessNode) node).base);
            for (var arg : ((AccessNode) node).args) check(arg);
        } else if (node instanceof BinaryOpNode) {
            check(((BinaryOpNode) node).left);
            check(((BinaryOpNode) node).right);
        }
    }
}