package com.xworkz.stringrepresntation;

public class ClockRunner {
    public static void main(String[] args) {

        Clock clock1 = new Clock();
        clock1.setBrand("Casio");

        Clock clock2 = new Clock();
        clock2.setBrand("Casio");

        System.out.println("Checking same location: " + (clock1 == clock2));
        boolean same = clock1.equals(clock2);
        System.out.println("clock1 is same as clock2: " + same);
    }
}