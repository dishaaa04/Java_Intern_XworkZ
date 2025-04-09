package com.xworkz.stringrepresntation;

public class Plate {

    private String shape;
    private String material;
    private double diameter;

    public Plate(String shape, String material, double diameter) {
        this.shape = shape;
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "[shape=" + shape + ", material=" + material + ", diameter=" + diameter + "cm]";
    }
}
