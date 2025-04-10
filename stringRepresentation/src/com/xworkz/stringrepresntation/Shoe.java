package com.xworkz.stringrepresntation;

public class Shoe {
    private String brand;
    private int size;
    private boolean isSports;

    public Shoe(String brand, int size, boolean isSports) {
        this.brand = brand;
        this.size = size;
        this.isSports = isSports;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", size=" + size + ", isSports=" + isSports + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 5400;
    }
}
