package com.xworkz.stringrepresntation;

public class Spoon {
    private String material;
    private String type;
    private double length;

    public Spoon(String material, String type, double length) {
        this.material = material;
        this.type = type;
        this.length = length;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", type=" + type + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 5800;
    }
}
