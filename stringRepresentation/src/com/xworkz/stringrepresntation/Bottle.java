package com.xworkz.stringrepresntation;

public class Bottle {

    private String brand;
    private double capacity;
    private boolean isReusable;

    public Bottle(String brand, double capacity, boolean isReusable) {
        this.brand = brand;
        this.capacity = capacity;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + ", isReusable=" + isReusable + "]";
    }
}
