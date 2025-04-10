package com.xworkz.stringrepresntation;

public class Paint {
    private String color;
    private String type;
    private double price;

    public Paint(String color, String type, double price) {
        this.color = color;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", type=" + type + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 4000;
    }
}
