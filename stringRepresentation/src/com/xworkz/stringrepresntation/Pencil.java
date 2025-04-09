package com.xworkz.stringrepresntation;

public class Pencil {

    private String brand;
    private String type;
    private boolean isSharpened;

    public Pencil(String brand, String type, boolean isSharpened) {
        this.brand = brand;
        this.type = type;
        this.isSharpened = isSharpened;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", isSharpened=" + isSharpened + "]";
    }
}
