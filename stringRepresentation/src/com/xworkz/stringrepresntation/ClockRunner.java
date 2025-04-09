package com.xworkz.stringrepresntation;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock = new Clock("Wall Clock", "Titan", false);
        System.out.println("clock" + clock.toString());
    }
}
