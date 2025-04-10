package com.xworkz.stringrepresntation;

public class Appliance {
    private String brand;
    private String type;
    private int power;

    public Appliance(String brand, String type, int power) {
        this.brand = brand;
        this.type = type;
        this.power = power;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", power=" + power + "W]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 300;
    }
}
