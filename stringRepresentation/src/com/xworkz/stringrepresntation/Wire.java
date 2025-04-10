package com.xworkz.stringrepresntation;

public class Wire {
    private String material;
    private double length;
    private boolean isInsulated;

    public Wire(String material, double length, boolean isInsulated) {
        this.material = material;
        this.length = length;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", length=" + length + ", isInsulated=" + isInsulated + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 7900;
    }
}
