package AST;

public class ObjectDeclaration implements ASTNode {
    private ASTNode propertyOrObjectName;
    private ObjectInit objectInit;

    public ObjectDeclaration(ASTNode propertyOrObjectName, ObjectInit objectInit) {
        this.propertyOrObjectName = propertyOrObjectName;
        this.objectInit = objectInit;

    }

    public ASTNode getPropertyOrObjectName() {
        return propertyOrObjectName;
    }

    public ObjectInit getObjectInit() {
        return objectInit;
    }



    @Override
    public String toString() {
        return "\nObjectDeclaration{" +
                "propertyOrObjectName=" + propertyOrObjectName +
                ", objectInit=" + objectInit +
                "\n}";
    }
}
