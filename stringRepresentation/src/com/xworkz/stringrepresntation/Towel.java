package com.xworkz.stringrepresntation;

public class Towel {
    private String size;
    private String color;
    private boolean isSoft;

    public Towel(String size, String color, boolean isSoft) {
        this.size = size;
        this.color = color;
        this.isSoft = isSoft;
    }

    @Override
    public String toString() {
        return "[size=" + size + ", color=" + color + ", isSoft=" + isSoft + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 6500;
    }
}
