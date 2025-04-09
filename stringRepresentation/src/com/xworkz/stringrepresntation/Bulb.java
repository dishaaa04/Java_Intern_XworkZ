package com.xworkz.stringrepresntation;

public class Bulb {

    private String brand;
    private int wattage;
    private String type;

    public Bulb(String brand, int wattage, String type) {
        this.brand = brand;
        this.wattage = wattage;
        this.type = type;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", wattage=" + wattage + ", type=" + type + "]";
    }
}
