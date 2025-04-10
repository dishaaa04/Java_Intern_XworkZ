package com.xworkz.stringrepresntation;

public class Vehicle {
    private String type;
    private String brand;
    private int wheels;

    public Vehicle(String type, String brand, int wheels) {
        this.type = type;
        this.brand = brand;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", wheels=" + wheels + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 7300;
    }
}
