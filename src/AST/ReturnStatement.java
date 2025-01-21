package AST;

public class ReturnStatement implements ASTNode {
    private ASTNode expression;

    public ReturnStatement(ASTNode expression) {
        this.expression = expression;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nReturnStatement{" +
                "\nexpression=" + expression +
                "\n}";
    }
}
