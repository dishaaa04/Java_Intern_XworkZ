package com.xworkz.stringrepresntation;

public class Board {
    private String material;
    private String usage;
    private int size;

    public Board(String material, String usage, int size) {
        this.material = material;
        this.usage = usage;
        this.size = size;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", usage=" + usage + ", size=" + size + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 145;
    }
}
