package com.xworkz.stringrepresntation;

public class Cylinder {
    private String gasType;
    private double weight;
    private boolean isFull;

    public Cylinder(String gasType, double weight, boolean isFull) {
        this.gasType = gasType;
        this.weight = weight;
        this.isFull = isFull;
    }

    @Override
    public String toString() {
        return "[gasType=" + gasType + ", weight=" + weight + "kg, isFull=" + isFull + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 1400;
    }
}
