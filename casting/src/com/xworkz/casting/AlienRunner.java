package com.xworkz.casting;

public class AlienRunner {

    public static void main(String[] args) {
        Alien alien = new GreenAlien();
        alien.live();
        alien.travel();
        alien.species();
        alien.communicate();




        System.out.println("----");

        GreenAlien green = new GreenAlien();
        green.live();
        green.travel();
        green.camouflage();
        green.species();

        System.out.println("----");

        SuperGreenAlien superAlien = new SuperGreenAlien();
        superAlien.live();
        superAlien.travel();
        superAlien.camouflage();
        superAlien.species();

        System.out.println("----");

        superAlien.controlAlien(new GreenAlien());
    }
}
