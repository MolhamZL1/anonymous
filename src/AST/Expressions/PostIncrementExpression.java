package AST.Expressions;



public class PostIncrementExpression extends Expression {
    private String identifier;

    public PostIncrementExpression(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier + "++";
    }
}
