package com.xworkz.stringrepresntation;

public class Appliance {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Appliance) {
            Appliance other = (Appliance) obj;
            return this.type.equals(other.type);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Appliance{type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}
