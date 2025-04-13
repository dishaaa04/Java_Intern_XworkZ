package com.xworkz.stringrepresntation;

public class GlassRunner {
    public static void main(String[] args) {

        Glass glass1 = new Glass();
        glass1.setShape("Round");
        glass1.setUsage("Drinking");

        Glass glass2 = new Glass();
        glass2.setShape("Round");
        glass2.setUsage("Drinking");

        System.out.println("Checking same location: " + (glass1 == glass2));
        boolean same = glass1.equals(glass2);
        System.out.println("glass1 is same as glass2: " + same);
    }
}
