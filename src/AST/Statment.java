package AST;

public class Statment implements ASTNode{
    private ASTNode statement;

    public Statment(ASTNode statement) {
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

