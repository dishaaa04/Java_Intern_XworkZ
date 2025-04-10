package com.xworkz.stringrepresntation;

public class Gate {
    private String material;
    private double height;
    private boolean isAutomatic;

    public Gate(String material, double height, boolean isAutomatic) {
        this.material = material;
        this.height = height;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", height=" + height + "ft, isAutomatic=" + isAutomatic + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 1900;
    }
}
