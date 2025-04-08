package com.xworkz.casting;

public class SuperGreenAlien extends GreenAlien {

    @Override
    public void live() {
        System.out.println("Super green alien lives in advanced Martian cities.");
    }

    public void controlAlien(Alien alien) {
        System.out.println("Controlling alien...");

        alien.communicate();

        if (alien instanceof GreenAlien) {
            System.out.println("This is a green alien.");
            GreenAlien green = (GreenAlien) alien;
            green.camouflage();
            green.species();
        }
    }
}
