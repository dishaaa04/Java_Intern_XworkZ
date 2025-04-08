package com.xworkz.casting;

public class SmartFestival extends CulturalFestival {

    @Override
    public void name() {
        System.out.println("Festival: Virtual Diwali Celebration");
    }

    public void manageFestival(Festival festival) {
        System.out.println("Managing festival schedule...");

        festival.name();
        festival.activities();

        if (festival instanceof CulturalFestival) {
            System.out.println("It's a CulturalFestival.");
            CulturalFestival cultural = (CulturalFestival) festival;
            cultural.traditionalEvents();
            cultural.month();
        }
    }
}
