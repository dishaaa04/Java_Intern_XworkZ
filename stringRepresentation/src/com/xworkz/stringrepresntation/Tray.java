package com.xworkz.stringrepresntation;

public class Tray {

    private String material;
    private String shape;
    private boolean isMicrowaveSafe;

    public Tray(String material, String shape, boolean isMicrowaveSafe) {
        this.material = material;
        this.shape = shape;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", shape=" + shape + ", isMicrowaveSafe=" + isMicrowaveSafe + "]";
    }
}
