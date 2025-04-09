package com.xworkz.stringrepresntation;

public class Wire {

    private String type;
    private double length;
    private boolean isCopper;

    public Wire(String type, double length, boolean isCopper) {
        this.type = type;
        this.length = length;
        this.isCopper = isCopper;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", length=" + length + "m, isCopper=" + isCopper + "]";
    }
}
