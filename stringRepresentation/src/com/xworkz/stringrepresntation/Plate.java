package com.xworkz.stringrepresntation;

public class Plate {
    private String material;
    private String shape;

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

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Plate) {
            Plate other = (Plate) obj;
            return this.material.equals(other.material) && this.shape.equals(other.shape);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Plate{material='" + material + "', shape='" + shape + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + shape.hashCode();
    }
}
