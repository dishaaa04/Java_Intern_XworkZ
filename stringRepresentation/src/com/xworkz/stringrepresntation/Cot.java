package com.xworkz.stringrepresntation;

public class Cot {
    private String material;
    private int legs;
    private boolean hasHeadboard;

    public Cot(String material, int legs, boolean hasHeadboard) {
        this.material = material;
        this.legs = legs;
        this.hasHeadboard = hasHeadboard;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", legs=" + legs + ", hasHeadboard=" + hasHeadboard + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 1200;
    }
}
