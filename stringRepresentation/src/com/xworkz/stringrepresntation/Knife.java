package com.xworkz.stringrepresntation;

public class Knife {
    private String bladeMaterial;
    private int length;
    private boolean isSharp;

    public Knife(String bladeMaterial, int length, boolean isSharp) {
        this.bladeMaterial = bladeMaterial;
        this.length = length;
        this.isSharp = isSharp;
    }

    @Override
    public String toString() {
        return "[bladeMaterial=" + bladeMaterial + ", length=" + length + "cm, isSharp=" + isSharp + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 2700;
    }
}
