package com.xworkz.stringrepresntation;

public class Fridge {
    private String brand;
    private int capacity;
    private boolean isDoubleDoor;

    public Fridge(String brand, int capacity, boolean isDoubleDoor) {
        this.brand = brand;
        this.capacity = capacity;
        this.isDoubleDoor = isDoubleDoor;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + "L, isDoubleDoor=" + isDoubleDoor + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 1800;
    }
}
