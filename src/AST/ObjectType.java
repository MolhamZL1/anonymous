package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectType implements ASTNode {
    private List<TypeWithList> types; // List of types with optional lists

    public ObjectType() {
        this.types = new ArrayList<>();
    }

    public void addType(String identifier, List<ASTNode> list) {
        this.types.add(new TypeWithList(identifier, list));
    }

    public List<TypeWithList> getTypes() {
        return types;
    }

    @Override
    public String toString() {
        return "ObjectType{" +
                "types=" + types +
                '}';
    }

    // Helper class to represent type with optional list
    public static class TypeWithList {
        private String identifier;
        private List<ASTNode> list;

        public TypeWithList(String identifier, List<ASTNode> list) {
            this.identifier = identifier;
            this.list = list;
        }

        public String getIdentifier() {
            return identifier;
        }

        public List<ASTNode> getList() {
            return list;
        }

        @Override
        public String toString() {
            return "TypeWithList{" +
                    "identifier='" + identifier + '\'' +
                   list!=null? ", list=" + list :""+
                    '}';
        }
    }
}
