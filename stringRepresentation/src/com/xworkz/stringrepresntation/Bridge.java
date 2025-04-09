package com.xworkz.stringrepresntation;

public class Bridge {

    private String name;
    private String type;
    private double length;

    public Bridge(String name, String type, double length) {
        this.name = name;
        this.type = type;
        this.length = length;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", type=" + type + ", length=" + length + "]";
    }
}
