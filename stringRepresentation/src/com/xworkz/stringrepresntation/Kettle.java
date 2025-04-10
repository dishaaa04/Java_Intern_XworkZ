package com.xworkz.stringrepresntation;

public class Kettle {
    private String brand;
    private int capacity;
    private boolean isElectric;

    public Kettle(String brand, int capacity, boolean isElectric) {
        this.brand = brand;
        this.capacity = capacity;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + "ml, isElectric=" + isElectric + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 2500;
    }
}
