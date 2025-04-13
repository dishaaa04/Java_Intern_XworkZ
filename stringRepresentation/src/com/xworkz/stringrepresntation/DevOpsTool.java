package com.xworkz.stringrepresntation;

public class DevOpsTool {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof DevOpsTool) {
                DevOpsTool other = (DevOpsTool) obj;
                return this.name.equals(other.name);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "DevOpsTool{name='" + name + "'}";
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
