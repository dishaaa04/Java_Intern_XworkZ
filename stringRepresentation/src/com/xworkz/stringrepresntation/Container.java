package com.xworkz.stringrepresntation;

public class Container {
    private String material;
    private double capacity;
    private boolean isSealed;

    public Container(String material, double capacity, boolean isSealed) {
        this.material = material;
        this.capacity = capacity;
        this.isSealed = isSealed;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", capacity=" + capacity + "L, isSealed=" + isSealed + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 1000;
    }
}
