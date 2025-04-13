package com.xworkz.stringrepresntation;

public class WallClockRunner {
    public static void main(String[] args) {
        WallClock c1 = new WallClock();
        c1.setShape("Round");

        WallClock c2 = new WallClock();
        c2.setShape("Round");

        System.out.println("Checking same location: " + (c1 == c2));
        boolean same = c1.equals(c2);
        System.out.println("c1 is same as c2: " + same);
    }
}
