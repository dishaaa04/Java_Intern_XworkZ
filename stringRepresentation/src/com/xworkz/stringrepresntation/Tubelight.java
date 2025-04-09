package com.xworkz.stringrepresntation;

public class Tubelight {

    private String brand;
    private int wattage;
    private double length;

    public Tubelight(String brand, int wattage, double length) {
        this.brand = brand;
        this.wattage = wattage;
        this.length = length;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", wattage=" + wattage + "W, length=" + length + "ft]";
    }
}
