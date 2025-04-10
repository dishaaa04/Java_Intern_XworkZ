package com.xworkz.stringrepresntation;

public class Bird {
    private String name;
    private String color;
    private boolean canFly;

    public Bird(String name, String color, boolean canFly) {
        this.name = name;
        this.color = color;
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", color=" + color + ", canFly=" + canFly + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 220;
    }
}
