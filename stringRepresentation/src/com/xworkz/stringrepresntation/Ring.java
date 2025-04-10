package com.xworkz.stringrepresntation;

public class Ring {
    private String material;
    private double size;
    private boolean isGemStudded;

    public Ring(String material, double size, boolean isGemStudded) {
        this.material = material;
        this.size = size;
        this.isGemStudded = isGemStudded;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", isGemStudded=" + isGemStudded + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 5000;
    }
}
