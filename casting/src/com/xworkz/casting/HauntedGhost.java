package com.xworkz.casting;

public class HauntedGhost extends Ghost {

    @Override
    public void name() {
        System.out.println("Name: Haunted Spirit");
    }

    @Override
    public void scareLevel() {
        System.out.println("Scare Level: High");
    }

    public void cursedPlace() {
        System.out.println("Cursed Place: Haunted Mansion");
    }

    @Override
    public void haunt() {
        System.out.println("Haunt: Creepy forest and old castles");
    }
}
