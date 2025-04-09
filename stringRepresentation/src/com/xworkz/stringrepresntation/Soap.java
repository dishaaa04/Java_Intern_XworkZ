package com.xworkz.stringrepresntation;

public class Soap {

    private String brand;
    private String fragrance;
    private double weight;

    public Soap(String brand, String fragrance, double weight) {
        this.brand = brand;
        this.fragrance = fragrance;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", fragrance=" + fragrance + ", weight=" + weight + "g]";
    }
}
