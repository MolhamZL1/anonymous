package AST;

public class ElseIfStatement implements ASTNode {
    private Expression condition; // The condition for the elseif
    private Block block; // The block to execute if the condition is true

    public ElseIfStatement(Expression condition, Block block) {
        this.condition = condition;
        this.block = block;
    }

    public Expression getCondition() {
        return condition;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "ElseIfStatement{" +
                "condition=" + condition +
                ", block=" + block +
                '}';
    }
}
