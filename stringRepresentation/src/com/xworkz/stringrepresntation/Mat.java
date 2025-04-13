package com.xworkz.stringrepresntation;

public class Mat {
    private String material;
    private double length;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mat) {
            Mat other = (Mat) obj;
            return this.material.equals(other.material) && this.length == other.length;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Mat{material='" + material + "', length=" + length + "}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + Double.hashCode(length);
    }
}
