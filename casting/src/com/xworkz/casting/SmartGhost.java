package com.xworkz.casting;

public class SmartGhost extends HauntedGhost {

    @Override
    public void name() {
        System.out.println("Name: AI-Controlled Ghost Simulator");
    }

    public void manageGhost(Ghost ghost) {
        System.out.println("Interacting with ghost...");

        ghost.name();
        ghost.scareLevel();

        if (ghost instanceof HauntedGhost) {
            System.out.println("It's a HauntedGhost.");
            HauntedGhost haunted = (HauntedGhost) ghost;
            haunted.cursedPlace();
            haunted.haunt();
        }
    }
}
