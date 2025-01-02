package AST;

import java.util.ArrayList;
import java.util.List;

public class ParameterList implements ASTNode{
    List<Parameter> parameters;

    public ParameterList(){
        parameters = new ArrayList<>();
    }

   public void addParameter(Parameter parameter){
        parameters.add(parameter);

    }

    @Override
    public String toString() {
        return "ParameterList" +
                  parameters;
    }
}
