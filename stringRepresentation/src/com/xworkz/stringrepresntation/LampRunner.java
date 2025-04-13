package com.xworkz.stringrepresntation;

public class LampRunner {
    public static void main(String[] args) {

        Lamp lamp1 = new Lamp();
        lamp1.setType("LED");
        lamp1.setWattage(12);

        Lamp lamp2 = new Lamp();
        lamp2.setType("LED");
        lamp2.setWattage(12);

        System.out.println("Checking same location: " + (lamp1 == lamp2));
        boolean same = lamp1.equals(lamp2);
        System.out.println("lamp1 is same as lamp2: " + same);
    }
}
