package com.xworkz.stringrepresntation;

public class Jacket {

    private String color;
    private String size;
    private String material;

    public Jacket(String color, String size, String material) {
        this.color = color;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", size=" + size + ", material=" + material + "]";
    }
}
