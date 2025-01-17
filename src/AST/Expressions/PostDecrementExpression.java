package AST.Expressions;



public class PostDecrementExpression extends Expression {
    private String identifier;

    public PostDecrementExpression(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier + "--";
    }
}
