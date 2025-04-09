package com.xworkz.stringrepresntation;

public class Cycle {

    private String brand;
    private int gearCount;
    private String color;

    public Cycle(String brand, int gearCount, String color) {
        this.brand = brand;
        this.gearCount = gearCount;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", gearCount=" + gearCount + ", color=" + color + "]";
    }
}
