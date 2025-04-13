package com.xworkz.stringrepresntation;
public class Building {
    private String usage;

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Building) {
                Building other = (Building) obj;
                return this.usage.equals(other.usage);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Building{usage='" + usage + "'}";
    }

    @Override
    public int hashCode() {
        return usage.hashCode();
    }
}