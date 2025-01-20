package Symbol;

public class Symbol {
private final String type;
private final String identifier;
private final String value;
private final String scope;

public Symbol(String type, String identifier, String value, String scope) {
        this.type = type;
        this.identifier = identifier;
        this.value = value;
        this.scope = scope;
        }

public String getType() {
        return type;
        }

public String getIdentifier() {
        return identifier;
        }

public String getValue() {
        return value;
        }

public String getScope() {
        return scope;
        }
        }