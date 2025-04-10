package com.xworkz.stringrepresntation;

public class YogaMat {
    private String color;
    private double thickness;
    private boolean isFoldable;

    public YogaMat(String color, double thickness, boolean isFoldable) {
        this.color = color;
        this.thickness = thickness;
        this.isFoldable = isFoldable;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", thickness=" + thickness + ", isFoldable=" + isFoldable + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 8300;
    }
}
