package com.xworkz.stringrepresntation;

public class Glass {
    private String type;
    private int thickness;
    private boolean isTempered;

    public Glass(String type, int thickness, boolean isTempered) {
        this.type = type;
        this.thickness = thickness;
        this.isTempered = isTempered;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", thickness=" + thickness + "mm, isTempered=" + isTempered + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 2000;
    }
}
