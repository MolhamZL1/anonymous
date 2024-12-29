package AST;

import antlr.AngularParser;

import java.util.ArrayList;
import java.util.List;

public class Program extends ASTNode{
  List<ClassDeclaration> classDeclarations;
    List<ImportStatement> importStatements;
    List<ComponentDeclaration> componentDeclarations;
    List<FunctionDeclaration> functionDeclarations;
    List<Statement>  statements;

    public Program() {
        this.classDeclarations =new ArrayList<ClassDeclaration>();
        this.importStatements = new ArrayList<ImportStatement>();
        this.componentDeclarations = new ArrayList<ComponentDeclaration>();
        this.functionDeclarations = new ArrayList<FunctionDeclaration>();
        this.statements = new ArrayList<Statement>();
    }

    public List<ClassDeclaration> getClassDeclarations() {
        return classDeclarations;
    }

    public void setClassDeclarations(List<ClassDeclaration> classDeclarations) {
        this.classDeclarations = classDeclarations;
    }

    public List<ImportStatement> getImportStatements() {
        return importStatements;
    }

    public void setImportStatements(List<ImportStatement> importStatements) {
        this.importStatements = importStatements;
    }

    public List<ComponentDeclaration> getComponentDeclarations() {
        return componentDeclarations;
    }

    public void setComponentDeclarations(List<ComponentDeclaration> componentDeclarations) {
        this.componentDeclarations = componentDeclarations;
    }

    public List<FunctionDeclaration> getFunctionDeclarations() {
        return functionDeclarations;
    }

    public void setFunctionDeclarations(List<FunctionDeclaration> functionDeclarations) {
        this.functionDeclarations = functionDeclarations;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
}
