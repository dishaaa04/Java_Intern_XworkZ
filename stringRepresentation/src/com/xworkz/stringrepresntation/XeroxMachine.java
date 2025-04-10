package com.xworkz.stringrepresntation;

public class XeroxMachine {
    private String brand;
    private boolean isColor;
    private int capacity;

    public XeroxMachine(String brand, boolean isColor, int capacity) {
        this.brand = brand;
        this.isColor = isColor;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", isColor=" + isColor + ", capacity=" + capacity + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 8000;
    }
}
