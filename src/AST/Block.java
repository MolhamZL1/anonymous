package AST;

import java.beans.Statement;
import java.util.ArrayList;
import java.util.List;

public class Block implements ASTNode {
    private List<Statment> statements; // List of statements
    private ReturnStatement returnStatement;

    public Block() {
        this.statements =new ArrayList<>();
    }
  public   void addStatment(Statment statement){
        this.statements.add(statement);

    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        return "\nBlock{" +
                "\nstatements=" + statements +
               ( returnStatement!=null? returnStatement.toString() :"" )+
                '}';
    }
}
