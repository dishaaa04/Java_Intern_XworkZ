package com.xworkz.stringrepresntation;

public class TV {
    private String brand;
    private int size;
    private boolean isSmart;

    public TV(String brand, int size, boolean isSmart) {
        this.brand = brand;
        this.size = size;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", size=" + size + ", isSmart=" + isSmart + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 7100;
    }
}
