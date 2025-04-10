package com.xworkz.stringrepresntation;

public class Table {
    private String shape;
    private String material;
    private int legs;

    public Table(String shape, String material, int legs) {
        this.shape = shape;
        this.material = material;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "[shape=" + shape + ", material=" + material + ", legs=" + legs + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 6000;
    }
}
