package com.xworkz.stringrepresntation;

public class RingRunner {
    public static void main(String[] args) {
        Ring ring1 = new Ring();
        ring1.setMaterial("Gold");
        ring1.setSize(6.5);
        ring1.setHasStone(true);

        Ring ring2 = new Ring();
        ring2.setMaterial("Gold");
        ring2.setSize(6.5);
        ring2.setHasStone(true);

        System.out.println("Checking same location: " + (ring1 == ring2));
        boolean same = ring1.equals(ring2);
        System.out.println("ring1 is same as ring2: " + same);
    }
}
