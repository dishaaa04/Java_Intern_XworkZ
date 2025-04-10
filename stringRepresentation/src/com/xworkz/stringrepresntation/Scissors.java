package com.xworkz.stringrepresntation;

public class Scissors {
    private String brand;
    private double length;
    private boolean isSharp;

    public Scissors(String brand, double length, boolean isSharp) {
        this.brand = brand;
        this.length = length;
        this.isSharp = isSharp;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", length=" + length + ", isSharp=" + isSharp + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 5100;
    }
}
