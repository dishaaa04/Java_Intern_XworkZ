package com.xworkz.stringrepresntation;

public class Box {

    private String shape;
    private String material;
    private double volume;

    public Box(String shape, String material, double volume) {
        this.shape = shape;
        this.material = material;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "[shape=" + shape + ", material=" + material + ", volume=" + volume + "]";
    }
}
