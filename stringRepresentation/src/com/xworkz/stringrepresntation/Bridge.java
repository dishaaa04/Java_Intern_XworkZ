package com.xworkz.stringrepresntation;

public class Bridge {
    private String name;
    private String material;
    private int length;

    public Bridge(String name, String material, int length) {
        this.name = name;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", material=" + material + ", length=" + length + "m]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 525;
    }
}
