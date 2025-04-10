package com.xworkz.stringrepresntation;

public class Television {
    private String brand;
    private int screenSize;
    private boolean isSmart;

    public Television(String brand, int screenSize, boolean isSmart) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", screenSize=" + screenSize + ", isSmart=" + isSmart + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 6200;
    }
}
