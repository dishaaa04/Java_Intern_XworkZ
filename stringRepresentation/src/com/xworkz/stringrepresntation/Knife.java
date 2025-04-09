package com.xworkz.stringrepresntation;

public class Knife {

    private String type;
    private double length;
    private boolean isSharp;

    public Knife(String type, double length, boolean isSharp) {
        this.type = type;
        this.length = length;
        this.isSharp = isSharp;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", length=" + length + "cm, isSharp=" + isSharp + "]";
    }
}
