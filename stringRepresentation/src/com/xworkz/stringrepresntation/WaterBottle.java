package com.xworkz.stringrepresntation;

public class WaterBottle {

    private String brand;
    private double capacity;
    private boolean isInsulated;

    public WaterBottle(String brand, double capacity, boolean isInsulated) {
        this.brand = brand;
        this.capacity = capacity;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + "L, isInsulated=" + isInsulated + "]";
    }
}
