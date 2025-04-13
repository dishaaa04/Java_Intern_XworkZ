package com.xworkz.stringrepresntation;

public class Tray {
    private String material;
    private String shape;
    private int compartments;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getCompartments() {
        return compartments;
    }

    public void setCompartments(int compartments) {
        this.compartments = compartments;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tray) {
            Tray other = (Tray) obj;
            return this.material.equals(other.material) &&
                    this.shape.equals(other.shape) &&
                    this.compartments == other.compartments;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tray{material='" + material + "', shape='" + shape + "', compartments=" + compartments + "}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + shape.hashCode() + compartments;
    }
}
