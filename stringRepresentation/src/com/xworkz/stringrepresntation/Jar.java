package com.xworkz.stringrepresntation;

public class Jar {

    private String material;
    private double capacity;
    private boolean isTransparent;

    public Jar(String material, double capacity, boolean isTransparent) {
        this.material = material;
        this.capacity = capacity;
        this.isTransparent = isTransparent;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", capacity=" + capacity + "L, isTransparent=" + isTransparent + "]";
    }
}
