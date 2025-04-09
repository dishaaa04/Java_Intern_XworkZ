package com.xworkz.stringrepresntation;

public class Stick {

    private String type;
    private double length;
    private boolean isFlexible;

    public Stick(String type, double length, boolean isFlexible) {
        this.type = type;
        this.length = length;
        this.isFlexible = isFlexible;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", length=" + length + "cm, isFlexible=" + isFlexible + "]";
    }
}
