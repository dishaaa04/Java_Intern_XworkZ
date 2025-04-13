package com.xworkz.stringrepresntation;

public class Compiler {
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Compiler) {
                Compiler other = (Compiler) obj;
                return this.language.equals(other.language);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Compiler{language='" + language + "'}";
    }

    @Override
    public int hashCode() {
        return language.hashCode();
    }
}
