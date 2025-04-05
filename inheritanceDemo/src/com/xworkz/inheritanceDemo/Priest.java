package com.xworkz.inheritanceDemo;

public class Priest extends Ghost {

    public Priest() {
        super();
        System.out.println("The priest arrives to fight the ghost...");
    }

    @Override
    public void haunt() {
        System.out.println("Priest confronts the haunting...");
    }

    @Override
    public void disappear() {
        System.out.println("Priest disappears into prayer...");
    }

    @Override
    public void makeWeirdNoises() {
        System.out.println("Priest chants mantras to counter the ghost...");
    }

    @Override
    public void possessObjects() {
        System.out.println("Priest blesses the possessed objects...");
    }

    @Override
    public void floatAround() {
        System.out.println("Priest moves with spiritual grace...");
    }

    public void throwObjects() {
        System.out.println("Priest throws holy objects...");
    }

    public void screamLoudly() {
        System.out.println("Priest screams to banish the spirit...");
    }

    public void messWithElectronics() {
        System.out.println("Priest neutralizes ghost's effect on electronics...");
    }

    public void openDoorsRandomly() {
        System.out.println("Priest opens doors to sacred realms...");
    }

    public void terrorizePeople() {
        System.out.println("Priest's presence terrifies evil spirits...");
    }
}
