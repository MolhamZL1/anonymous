package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportStatement implements ASTNode {
    private String source;
    private String defaultImport;
    private ImportSpecifier.Specifier wildcardImport;
    private List<ImportSpecifier> namedImports;

    public ImportStatement() {
        this.namedImports = new ArrayList<>();
    }

    // Getters and Setters
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDefaultImport() {
        return defaultImport;
    }

    public void setDefaultImport(String defaultImport) {
        this.defaultImport = defaultImport;
    }

    public ImportSpecifier.Specifier getWildcardImport() {
        return wildcardImport;
    }

    public void setWildcardImport(ImportSpecifier.Specifier wildcardImport) {
        this.wildcardImport = wildcardImport;
    }

    public List<ImportSpecifier> getNamedImports() {
        return namedImports;
    }

    public void addNamedImport(ImportSpecifier namedImport) {
        this.namedImports.add(namedImport);
    }

    @Override
    public String toString() {
        return "\nImportStatement{" +
                "source='" + source + '\'' +
                (defaultImport != null ?  defaultImport + '\'' : "") +
                (wildcardImport != null ?  wildcardImport : "") +
                (!namedImports.isEmpty() ?  namedImports : "") +
                '}';
    }
}
