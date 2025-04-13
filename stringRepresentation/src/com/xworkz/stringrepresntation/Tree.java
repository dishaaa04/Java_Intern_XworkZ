package com.xworkz.stringrepresntation;

public class Tree {
    private String species;
    private int age;
    private double height;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tree) {
            Tree other = (Tree) obj;
            return this.species.equals(other.species) &&
                    this.age == other.age &&
                    this.height == other.height;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tree{species='" + species + "', age=" + age + ", height=" + height + "}";
    }

    @Override
    public int hashCode() {
        return species.hashCode() + age + Double.valueOf(height).hashCode();
    }
}
