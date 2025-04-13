package com.xworkz.stringrepresntation;

public class Spoon {
    private String material;
    private String color;
    private double length;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Spoon) {
            Spoon other = (Spoon) obj;
            return this.material.equals(other.material)
                    && this.color.equals(other.color)
                    && this.length == other.length;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Spoon{material='" + material + "', color='" + color + "', length=" + length + "}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + color.hashCode() + Double.valueOf(length).hashCode();
    }
}
