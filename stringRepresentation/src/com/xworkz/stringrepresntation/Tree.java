package com.xworkz.stringrepresntation;

public class Tree {

    private String species;
    private double height;
    private int age;

    public Tree(String species, double height, int age) {
        this.species = species;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[species=" + species + ", height=" + height + "m, age=" + age + " years]";
    }
}
