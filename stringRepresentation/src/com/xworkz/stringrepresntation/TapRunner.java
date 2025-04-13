package com.xworkz.stringrepresntation;

public class TapRunner {
    public static void main(String[] args) {
        Tap tap1 = new Tap();
        tap1.setType("Mixer");
        tap1.setMaterial("Steel");
        tap1.setAutomatic(false);

        Tap tap2 = new Tap();
        tap2.setType("Mixer");
        tap2.setMaterial("Steel");
        tap2.setAutomatic(false);

        System.out.println("Checking same location: " + (tap1 == tap2));
        boolean same = tap1.equals(tap2);
        System.out.println("tap1 is same as tap2: " + same);
    }
}
