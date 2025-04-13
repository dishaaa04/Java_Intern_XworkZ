package com.xworkz.stringrepresntation;

public class WireRunner {
    public static void main(String[] args) {
        Wire w1 = new Wire();
        w1.setMaterial("Copper");

        Wire w2 = new Wire();
        w2.setMaterial("Copper");

        System.out.println("Checking same location: " + (w1 == w2));
        boolean same = w1.equals(w2);
        System.out.println("w1 is same as w2: " + same);
    }
}
