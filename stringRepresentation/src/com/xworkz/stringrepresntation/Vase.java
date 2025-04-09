package com.xworkz.stringrepresntation;

public class Vase {

    private String material;
    private String color;
    private double height;

    public Vase(String material, String color, double height) {
        this.material = material;
        this.color = color;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", height=" + height + "cm]";
    }
}
