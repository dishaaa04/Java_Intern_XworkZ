package com.xworkz.inheritanceDemo;

public class Persons extends Family {
    Persons() {
        super();
        System.out.println("Persons class");
    }

    @Override
    public void bonding() {
        System.out.println("Persons create bonding through shared experiences");
    }

    @Override
    public void support() {
        System.out.println("Persons provide emotional and financial support");
    }

    @Override
    public void surname() {
        System.out.println("Persons carry forward the family surname");
    }

    @Override
    public void traditions() {
        System.out.println("Persons adapt traditions in modern ways");
    }

    @Override
    public void values() {
        System.out.println("Persons uphold values in everyday life");
    }

    public void education() {
        System.out.println("Persons pursue education for growth");
    }

    public void hobbies() {
        System.out.println("Persons enjoy hobbies during free time");
    }

    public void profession() {
        System.out.println("Persons choose professions for livelihood");
    }

    public void responsibility() {
        System.out.println("Persons take responsibilities seriously");
    }

    public void socialLife() {
        System.out.println("Persons maintain a social life");
    }
}
