package com.xworkz.stringrepresntation;

public class Refrigerator {
    private String brand;
    private int capacity;
    private boolean isDoubleDoor;

    public Refrigerator(String brand, int capacity, boolean isDoubleDoor) {
        this.brand = brand;
        this.capacity = capacity;
        this.isDoubleDoor = isDoubleDoor;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + ", isDoubleDoor=" + isDoubleDoor + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 4800;
    }
}
