package com.xworkz.casting;

public class FestivalRunner {

    public static void main(String[] args) {

        Festival festival = new CulturalFestival();
        festival.name();
        festival.month();
        festival.activities();
        festival.location();

        System.out.println("----");

        CulturalFestival cultural = new CulturalFestival();
        cultural.name();
        cultural.traditionalEvents();
        cultural.month();
        cultural.location();

        System.out.println("----");

        SmartFestival smart = new SmartFestival();
        smart.name();
        smart.traditionalEvents();
        smart.location();

        System.out.println("----");

        smart.manageFestival(new CulturalFestival());
    }
}
