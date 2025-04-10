package com.xworkz.stringrepresntation;

public class Boat {
    private String name;
    private String type;
    private int capacity;

    public Boat(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", type=" + type + ", capacity=" + capacity + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 410;
    }
}
