package com.xworkz.stringrepresntation;

public class Paint {

    private String color;
    private String type;
    private double quantity;

    public Paint(String color, String type, double quantity) {
        this.color = color;
        this.type = type;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", type=" + type + ", quantity=" + quantity + "L]";
    }
}
