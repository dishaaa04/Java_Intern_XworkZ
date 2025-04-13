package com.xworkz.stringrepresntation;

public class SofaRunner {
    public static void main(String[] args) {
        Sofa sofa1 = new Sofa();
        sofa1.setMaterial("Leather");
        sofa1.setSeats(3);
        sofa1.setColor("Brown");

        Sofa sofa2 = new Sofa();
        sofa2.setMaterial("Leather");
        sofa2.setSeats(3);
        sofa2.setColor("Brown");

        System.out.println("Checking same location: " + (sofa1 == sofa2));
        boolean same = sofa1.equals(sofa2);
        System.out.println("sofa1 is same as sofa2: " + same);
    }
}
