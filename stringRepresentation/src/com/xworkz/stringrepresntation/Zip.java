package com.xworkz.stringrepresntation;

public class Zip {

    private String material;
    private double length;
    private boolean isAutomatic;

    public Zip(String material, double length, boolean isAutomatic) {
        this.material = material;
        this.length = length;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", length=" + length + "cm, isAutomatic=" + isAutomatic + "]";
    }
}
