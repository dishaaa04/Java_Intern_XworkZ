package com.xworkz.stringrepresntation;

public class Chair {

    private String material;
    private String color;
    private boolean hasArmrest;

    public Chair(String material, String color, boolean hasArmrest) {
        this.material = material;
        this.color = color;
        this.hasArmrest = hasArmrest;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", hasArmrest=" + hasArmrest + "]";
    }
}
