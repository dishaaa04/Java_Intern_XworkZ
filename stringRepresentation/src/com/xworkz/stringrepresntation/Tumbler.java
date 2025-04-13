package com.xworkz.stringrepresntation;

public class Tumbler {
    private String material;
    private double capacity;
    private String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tumbler) {
            Tumbler other = (Tumbler) obj;
            return this.material.equals(other.material) &&
                    this.capacity == other.capacity &&
                    this.color.equals(other.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tumbler{material='" + material + "', capacity=" + capacity + ", color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + color.hashCode() + Double.valueOf(capacity).hashCode();
    }
}
