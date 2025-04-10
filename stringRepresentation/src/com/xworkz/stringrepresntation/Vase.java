package com.xworkz.stringrepresntation;

public class Vase {
    private String material;
    private double height;
    private boolean isDecorative;

    public Vase(String material, double height, boolean isDecorative) {
        this.material = material;
        this.height = height;
        this.isDecorative = isDecorative;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", height=" + height + ", isDecorative=" + isDecorative + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 7200;
    }
}
