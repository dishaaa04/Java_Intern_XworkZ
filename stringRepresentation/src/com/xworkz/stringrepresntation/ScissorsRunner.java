package com.xworkz.stringrepresntation;

public class ScissorsRunner {
    public static void main(String[] args) {
        Scissors sc1 = new Scissors();
        sc1.setBrand("Cello");
        sc1.setLength(8.5);
        sc1.setSharp(true);

        Scissors sc2 = new Scissors();
        sc2.setBrand("Cello");
        sc2.setLength(8.5);
        sc2.setSharp(true);

        System.out.println("Checking same location: " + (sc1 == sc2));
        boolean same = sc1.equals(sc2);
        System.out.println("sc1 is same as sc2: " + same);
    }
}
