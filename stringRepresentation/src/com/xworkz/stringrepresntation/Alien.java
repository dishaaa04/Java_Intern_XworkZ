package com.xworkz.stringrepresntation;

public class Alien {
    private String planet;
    private int eyes;
    private int age;

    public Alien(String planet, int eyes, int age) {
        this.planet = planet;
        this.eyes = eyes;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[planet=" + planet + ", eyes=" + eyes + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 350;
    }
}
