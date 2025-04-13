package com.xworkz.stringrepresntation;

public class Vehicle {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Vehicle) {
            Vehicle other = (Vehicle) obj;
            return this.type.equals(other.type);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehicle{type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}
