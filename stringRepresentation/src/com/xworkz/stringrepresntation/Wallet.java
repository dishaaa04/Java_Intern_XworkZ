package com.xworkz.stringrepresntation;

public class Wallet {

    private String material;
    private String color;
    private int compartments;

    public Wallet(String material, String color, int compartments) {
        this.material = material;
        this.color = color;
        this.compartments = compartments;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", compartments=" + compartments + "]";
    }
}
