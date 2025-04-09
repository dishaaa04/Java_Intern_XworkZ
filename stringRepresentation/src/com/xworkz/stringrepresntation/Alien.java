package com.xworkz.stringrepresntation;

public class Alien {

    private String planet;
    private int age;
    private boolean isFriendly;

    public Alien(String planet, int age, boolean isFriendly) {
        this.planet = planet;
        this.age = age;
        this.isFriendly = isFriendly;
    }

    @Override
    public String toString() {
        return "[planet=" + planet + ", age=" + age + ", isFriendly=" + isFriendly + "]";
    }
}
