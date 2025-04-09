package com.xworkz.stringrepresntation;

public class Pan {

    private String material;
    private double diameter;
    private boolean isNonStick;

    public Pan(String material, double diameter, boolean isNonStick) {
        this.material = material;
        this.diameter = diameter;
        this.isNonStick = isNonStick;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", diameter=" + diameter + "cm, isNonStick=" + isNonStick + "]";
    }
}
