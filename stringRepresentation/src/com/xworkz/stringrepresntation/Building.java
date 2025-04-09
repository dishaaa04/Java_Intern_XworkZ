package com.xworkz.stringrepresntation;

public class Building {

    private String name;
    private int floors;
    private String location;

    public Building(String name, int floors, String location) {
        this.name = name;
        this.floors = floors;
        this.location = location;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", floors=" + floors + ", location=" + location + "]";
    }
}
