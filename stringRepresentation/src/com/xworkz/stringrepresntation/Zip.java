package com.xworkz.stringrepresntation;

public class Zip {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Zip) {
            Zip other = (Zip) obj;
            return this.type.equals(other.type);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Zip{type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}
