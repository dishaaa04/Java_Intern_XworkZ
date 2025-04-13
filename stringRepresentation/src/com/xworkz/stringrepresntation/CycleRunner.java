package com.xworkz.stringrepresntation;

public class CycleRunner {
    public static void main(String[] args) {

        Cycle cycle1 = new Cycle();
        cycle1.setBrand("Hero");

        Cycle cycle2 = new Cycle();
        cycle2.setBrand("Hero");

        System.out.println("Checking same location: " + (cycle1 == cycle2));
        boolean same = cycle1.equals(cycle2);
        System.out.println("cycle1 is same as cycle2: " + same);
    }
}
