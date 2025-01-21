package Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    private final Map<String, Symbol> symbols = new HashMap<>();


    public void addSymbol(String type, String identifier, String value, String scope) {
        symbols.put(identifier,new Symbol(type, identifier, value, scope));
    }


    public void print() {
        System.out.println("----------------------Symbol Table----------------------------------");
        System.out.println("Type\t\t\tIdentifier\t\t\tValue\t\t\tScope");
        System.out.println("------------------------------------------------------------------------------");

        for (Symbol symbol : symbols.values()) {
            System.out.printf("%-15s %-15s %-15s %-10s%n",
                    symbol.getType(),
                    symbol.getIdentifier(),
                    symbol.getValue(),
                    symbol.getScope());
        }
    }
}