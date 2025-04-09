package com.xworkz.stringrepresntation;

public class Animal {

    private String name;
    private String habitat;
    private int lifespan;

    public Animal(String name, String habitat, int lifespan) {
        this.name = name;
        this.habitat = habitat;
        this.lifespan = lifespan;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", habitat=" + habitat + ", lifespan=" + lifespan + "]";
    }
}
