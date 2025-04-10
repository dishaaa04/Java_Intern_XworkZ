package com.xworkz.stringrepresntation;

public class Mat {
    private String material;
    private String color;
    private boolean isWashable;

    public Mat(String material, String color, boolean isWashable) {
        this.material = material;
        this.color = color;
        this.isWashable = isWashable;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", isWashable=" + isWashable + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 3200;
    }
}
