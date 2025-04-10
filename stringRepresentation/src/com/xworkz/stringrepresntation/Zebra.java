package com.xworkz.stringrepresntation;

public class Zebra {
    private String habitat;
    private int age;
    private boolean isWild;

    public Zebra(String habitat, int age, boolean isWild) {
        this.habitat = habitat;
        this.age = age;
        this.isWild = isWild;
    }

    @Override
    public String toString() {
        return "[habitat=" + habitat + ", age=" + age + ", isWild=" + isWild + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 9000;
    }
}
