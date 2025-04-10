package com.xworkz.stringrepresntation;

public class Bank {
    private String name;
    private String location;
    private int branches;

    public Bank(String name, String location, int branches) {
        this.name = name;
        this.location = location;
        this.branches = branches;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", location=" + location + ", branches=" + branches + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 500;
    }
}
