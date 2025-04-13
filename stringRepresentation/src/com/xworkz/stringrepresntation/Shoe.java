package com.xworkz.stringrepresntation;

public class Shoe {
    private String brand;
    private double size;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shoe) {
            Shoe other = (Shoe) obj;
            return this.brand.equals(other.brand)
                    && this.size == other.size
                    && this.color.equals(other.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Shoe{brand='" + brand + "', size=" + size + ", color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + Double.valueOf(size).hashCode() + color.hashCode();
    }
}
