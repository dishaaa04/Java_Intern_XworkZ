package com.xworkz.stringrepresntation;

public class Fridge {

    private String brand;
    private int capacity;
    private boolean hasFreezer;

    public Fridge(String brand, int capacity, boolean hasFreezer) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + "L, hasFreezer=" + hasFreezer + "]";
    }
}
