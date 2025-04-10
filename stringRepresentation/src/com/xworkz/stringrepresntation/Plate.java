package com.xworkz.stringrepresntation;

public class Plate {
    private String material;
    private String shape;
    private double diameter;

    public Plate(String material, String shape, double diameter) {
        this.material = material;
        this.shape = shape;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", shape=" + shape + ", diameter=" + diameter + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 4500;
    }
}
