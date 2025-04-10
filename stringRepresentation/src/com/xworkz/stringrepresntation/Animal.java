package com.xworkz.stringrepresntation;

public class Animal {
    private String species;
    private int legs;
    private boolean isDomestic;

    public Animal(String species, int legs, boolean isDomestic) {
        this.species = species;
        this.legs = legs;
        this.isDomestic = isDomestic;
    }

    @Override
    public String toString() {
        return "[species=" + species + ", legs=" + legs + ", isDomestic=" + isDomestic + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 275;
    }
}
