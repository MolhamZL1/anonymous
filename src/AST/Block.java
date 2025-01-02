package AST;

import java.beans.Statement;
import java.util.ArrayList;
import java.util.List;

public class Block implements ASTNode {
    private List<Statment> statements; // List of statements

    public Block() {
        this.statements =new ArrayList<>();
    }
    void addStatment(Statement statement){
        this.statements.add(statement);

    }
    @Override
    public String toString() {
        return "Block{" +
                "statements=" + statements +
                '}';
    }
}
