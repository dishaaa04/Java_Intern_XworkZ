package com.xworkz.stringrepresntation;

public class Compiler {
    private String language;
    private String version;
    private boolean isOptimizing;

    public Compiler(String language, String version, boolean isOptimizing) {
        this.language = language;
        this.version = version;
        this.isOptimizing = isOptimizing;
    }

    @Override
    public String toString() {
        return "[language=" + language + ", version=" + version + ", isOptimizing=" + isOptimizing + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 888;
    }
}
