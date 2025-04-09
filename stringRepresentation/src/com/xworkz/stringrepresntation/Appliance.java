package com.xworkz.stringrepresntation;

public class Appliance {

    private String brand;
    private String type;
    private double power;

    public Appliance(String brand, String type, double power) {
        this.brand = brand;
        this.type = type;
        this.power = power;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", power=" + power + "]";
    }
}
