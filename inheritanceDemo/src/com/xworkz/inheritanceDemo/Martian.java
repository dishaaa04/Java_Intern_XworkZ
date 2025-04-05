package com.xworkz.inheritanceDemo;

public class Martian extends Alien {

    Martian() {
        System.out.println("Martian subclass created");
    }

    @Override
    public void communicate() {
        System.out.println("Martian communicates using radio signals");
    }

    @Override
    public void abductHumans() {
        System.out.println("Martian abducts only for research, not harm");
    }

    @Override
    public void controlSpaceship() {
        System.out.println("Martian uses AI to control the spaceship");
    }

    public void growTentacles() {
        System.out.println("Martian grows extra tentacles");
    }

    public void camouflage() {
        System.out.println("Martian uses camouflage to blend in");
    }

    public void terraformPlanet() {
        System.out.println("Martian is terraforming a new planet");
    }

    public void summonUFO() {
        System.out.println("Martian summons a UFO for travel");
    }

    public void danceToEarthMusic() {
        System.out.println("Martian dances to Earth music");
    }
}
