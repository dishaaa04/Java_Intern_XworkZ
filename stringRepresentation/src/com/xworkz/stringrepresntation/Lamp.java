package com.xworkz.stringrepresntation;

public class Lamp {
    private String type;
    private int wattage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lamp) {
            Lamp other = (Lamp) obj;
            return this.type.equals(other.type) && this.wattage == other.wattage;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Lamp{type='" + type + "', wattage=" + wattage + "}";
    }

    @Override
    public int hashCode() {
        return type.hashCode() + wattage;
    }
}
