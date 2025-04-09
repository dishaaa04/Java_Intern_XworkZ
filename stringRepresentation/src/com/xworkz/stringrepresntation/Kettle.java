package com.xworkz.stringrepresntation;

public class Kettle {

    private String brand;
    private double capacity;
    private boolean isElectric;

    public Kettle(String brand, double capacity, boolean isElectric) {
        this.brand = brand;
        this.capacity = capacity;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + "L, isElectric=" + isElectric + "]";
    }
}
