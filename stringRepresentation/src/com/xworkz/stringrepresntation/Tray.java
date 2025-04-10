package com.xworkz.stringrepresntation;

public class Tray {
    private String material;
    private int compartments;
    private boolean isMicrowaveSafe;

    public Tray(String material, int compartments, boolean isMicrowaveSafe) {
        this.material = material;
        this.compartments = compartments;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", compartments=" + compartments + ", isMicrowaveSafe=" + isMicrowaveSafe + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 6700;
    }
}
