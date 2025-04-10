package com.xworkz.stringrepresntation;

public class Box {
    private String shape;
    private String color;
    private double weight;

    public Box(String shape, String color, double weight) {
        this.shape = shape;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[shape=" + shape + ", color=" + color + ", weight=" + weight + "kg]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 332;
    }
}
