package com.xworkz.stringrepresntation;

public class Towel {

    private String color;
    private String material;
    private double length;

    public Towel(String color, String material, double length) {
        this.color = color;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", material=" + material + ", length=" + length + "cm]";
    }
}
