package AST;

public class ShortElse implements ASTNode {
    private Statement statement;

    public ShortElse(Statement statement) {
        this.statement = statement;
    }

    public Statement getStatement() {
        return statement;
    }

    @Override
    public String toString() {
        return "ShortElse{" +
                "statement=" + statement +
                '}';
    }
}
