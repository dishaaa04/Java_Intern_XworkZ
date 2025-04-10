package com.xworkz.stringrepresntation;

public class Jar {
    private String material;
    private int capacity;
    private boolean isTransparent;

    public Jar(String material, int capacity, boolean isTransparent) {
        this.material = material;
        this.capacity = capacity;
        this.isTransparent = isTransparent;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", capacity=" + capacity + "ml, isTransparent=" + isTransparent + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 2400;
    }
}
