package AST.Expressions;

import AST.ASTNode;
import AST.Expressions.Expression;


public class AssignmentExpression implements Expression {
    private ASTNode left;
    private ASTNode right;

    public AssignmentExpression(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    public ASTNode getLeft() {
        return left;
    }

    public ASTNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return left + " = " + right;
    }
}
