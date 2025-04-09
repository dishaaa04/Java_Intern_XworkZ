package com.xworkz.stringrepresntation;

public class Tumbler {

    private String material;
    private double capacity;
    private boolean hasLid;

    public Tumbler(String material, double capacity, boolean hasLid) {
        this.material = material;
        this.capacity = capacity;
        this.hasLid = hasLid;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", capacity=" + capacity + "ml, hasLid=" + hasLid + "]";
    }
}
