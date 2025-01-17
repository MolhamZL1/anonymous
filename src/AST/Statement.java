package AST;

public class Statement implements ASTNode{
    private ASTNode statement;

    public Statement(ASTNode statement) {
        this.statement = statement;
    }

    public ASTNode getStatement() {
        return statement;
    }

    @Override
    public String toString() {
        return statement.toString();
    }
}

