package com.xworkz.stringrepresntation;

public class PanRunner {
    public static void main(String[] args) {
        Pan pan1 = new Pan();
        pan1.setMaterial("Steel");
        pan1.setDiameter(28);

        Pan pan2 = new Pan();
        pan2.setMaterial("Steel");
        pan2.setDiameter(28);

        System.out.println("Checking same location: " + (pan1 == pan2));
        boolean same = pan1.equals(pan2);
        System.out.println("pan1 is same as pan2: " + same);
    }
}
