package com.xworkz.stringrepresntation;

public class Pan {
    private String material;
    private int diameter;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pan) {
            Pan other = (Pan) obj;
            return this.material.equals(other.material) && this.diameter == other.diameter;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pan{material='" + material + "', diameter=" + diameter + "}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + diameter;
    }
}
