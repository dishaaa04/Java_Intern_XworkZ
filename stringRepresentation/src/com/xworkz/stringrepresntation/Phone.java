package com.xworkz.stringrepresntation;

public class Phone {
    private String brand;
    private String model;
    private double screenSize;

    public Phone(String brand, String model, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", model=" + model + ", screenSize=" + screenSize + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 4300;
    }
}
