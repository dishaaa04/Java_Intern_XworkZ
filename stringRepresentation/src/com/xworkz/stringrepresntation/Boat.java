package com.xworkz.stringrepresntation;

public class Boat {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Boat) {
            Boat other = (Boat) obj;
            return this.type.equals(other.type);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Boat{type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}
