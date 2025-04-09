package com.xworkz.stringrepresntation;

public class WallClockRunner {
    public static void main(String[] args) {
        WallClock clock = new WallClock("Round", "Ajanta", true);
        System.out.println("wallClock" + clock.toString());
    }
}
