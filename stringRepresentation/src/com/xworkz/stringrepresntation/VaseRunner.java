package com.xworkz.stringrepresntation;

public class VaseRunner {
    public static void main(String[] args) {
        Vase vase1 = new Vase();
        vase1.setMaterial("Ceramic");

        Vase vase2 = new Vase();
        vase2.setMaterial("Ceramic");

        System.out.println("Checking same location: " + (vase1 == vase2));
        boolean same = vase1.equals(vase2);
        System.out.println("vase1 is same as vase2: " + same);
    }
}
