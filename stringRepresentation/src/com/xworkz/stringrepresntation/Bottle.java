package com.xworkz.stringrepresntation;

public class Bottle {
    private String material;
    private double capacity;
    private boolean isReusable;

    public Bottle(String material, double capacity, boolean isReusable) {
        this.material = material;
        this.capacity = capacity;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", capacity=" + capacity + "L, isReusable=" + isReusable + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 301;
    }
}
