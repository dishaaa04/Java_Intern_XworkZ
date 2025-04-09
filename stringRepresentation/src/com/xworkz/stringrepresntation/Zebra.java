package com.xworkz.stringrepresntation;

public class Zebra {

    private String name;
    private int age;
    private boolean isWild;

    public Zebra(String name, int age, boolean isWild) {
        this.name = name;
        this.age = age;
        this.isWild = isWild;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + " years, isWild=" + isWild + "]";
    }
}
