package com.xworkz.stringrepresntation;

public class Cooker {

    private String brand;
    private double capacity;
    private boolean isElectric;

    public Cooker(String brand, double capacity, boolean isElectric) {
        this.brand = brand;
        this.capacity = capacity;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + "L, isElectric=" + isElectric + "]";
    }
}
