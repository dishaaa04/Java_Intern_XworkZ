package com.xworkz.casting;

public class GreenAlien extends Alien {

    @Override
    public void live() {
        System.out.println("Green alien lives on Mars.");
    }

    @Override
    public void travel() {
        System.out.println("Green alien travels using spacecraft.");
    }

    public void camouflage() {
        System.out.println("Green alien can camouflage.");
    }

    @Override
    public void species() {
        System.out.println("Species: Martian.");
    }
}
