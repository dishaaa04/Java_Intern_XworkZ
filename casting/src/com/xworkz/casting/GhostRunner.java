package com.xworkz.casting;

public class GhostRunner {

    public static void main(String[] args) {

        Ghost ghost = new HauntedGhost();
        ghost.name();
        ghost.origin();
        ghost.scareLevel();
        ghost.haunt();

        System.out.println("----");

        HauntedGhost haunted = new HauntedGhost();
        haunted.name();
        haunted.cursedPlace();
        haunted.scareLevel();
        haunted.haunt();

        System.out.println("----");

        SmartGhost smart = new SmartGhost();
        smart.name();
        smart.cursedPlace();
        smart.haunt();

        System.out.println("----");

        smart.manageGhost(new HauntedGhost());
    }
}
