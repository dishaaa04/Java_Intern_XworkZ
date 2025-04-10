package com.xworkz.stringrepresntation;

public class Thread {
    private String color;
    private double length;
    private String material;

    public Thread(String color, double length, String material) {
        this.color = color;
        this.length = length;
        this.material = material;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", length=" + length + ", material=" + material + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 6400;
    }
}
