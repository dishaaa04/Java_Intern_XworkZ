package com.xworkz.stringrepresntation;

public class Cylinder {

    private double height;
    private double radius;
    private String material;

    public Cylinder(double height, double radius, String material) {
        this.height = height;
        this.radius = radius;
        this.material = material;
    }

    @Override
    public String toString() {
        return "[height=" + height + "cm, radius=" + radius + "cm, material=" + material + "]";
    }
}
