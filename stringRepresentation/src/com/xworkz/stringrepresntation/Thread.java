package com.xworkz.stringrepresntation;

public class Thread {

    private String color;
    private String material;
    private double length;

    public Thread(String color, String material, double length) {
        this.color = color;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", material=" + material + ", length=" + length + " meters]";
    }
}
