package com.xworkz.stringrepresntation;

public class Zoo {

    private String name;
    private String location;
    private int numberOfAnimals;

    public Zoo(String name, String location, int numberOfAnimals) {
        this.name = name;
        this.location = location;
        this.numberOfAnimals = numberOfAnimals;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", location=" + location + ", numberOfAnimals=" + numberOfAnimals + "]";
    }
}
