package com.xworkz.stringrepresntation;

public class Button {

    private String shape;
    private String color;
    private String material;

    public Button(String shape, String color, String material) {
        this.shape = shape;
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString() {
        return "[shape=" + shape + ", color=" + color + ", material=" + material + "]";
    } }
