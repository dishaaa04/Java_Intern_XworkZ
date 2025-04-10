package com.xworkz.stringrepresntation;

public class Pan {
    private String material;
    private int diameter;
    private boolean hasLid;

    public Pan(String material, int diameter, boolean hasLid) {
        this.material = material;
        this.diameter = diameter;
        this.hasLid = hasLid;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", diameter=" + diameter + ", hasLid=" + hasLid + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 4100;
    }
}
