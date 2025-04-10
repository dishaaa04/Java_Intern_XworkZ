package com.xworkz.stringrepresntation;

public class Stick {
    private String material;
    private double length;
    private boolean isFlexible;

    public Stick(String material, double length, boolean isFlexible) {
        this.material = material;
        this.length = length;
        this.isFlexible = isFlexible;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", length=" + length + ", isFlexible=" + isFlexible + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 5900;
    }
}
