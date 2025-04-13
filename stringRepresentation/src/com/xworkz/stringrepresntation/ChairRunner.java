package com.xworkz.stringrepresntation;

public class ChairRunner {
    public static void main(String[] args) {

        Chair chair1 = new Chair();
        chair1.setMaterial("Wood");

        Chair chair2 = new Chair();
        chair2.setMaterial("Wood");

        System.out.println("Checking same location: " + (chair1 == chair2));
        boolean same = chair1.equals(chair2);
        System.out.println("chair1 is same as chair2: " + same);
    }
}