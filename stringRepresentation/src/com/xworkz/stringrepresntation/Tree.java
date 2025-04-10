package com.xworkz.stringrepresntation;

public class Tree {
    private String species;
    private int height;
    private boolean hasFruits;

    public Tree(String species, int height, boolean hasFruits) {
        this.species = species;
        this.height = height;
        this.hasFruits = hasFruits;
    }

    @Override
    public String toString() {
        return "[species=" + species + ", height=" + height + ", hasFruits=" + hasFruits + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 6800;
    }
}
