package com.xworkz.stringrepresntation;

public class BorewellRunner {
    public static void main(String[] args) {

        Borewell borewell1 = new Borewell();
        borewell1.setLocation("Chennai");

        Borewell borewell2 = new Borewell();
        borewell2.setLocation("Chennai");

        System.out.println("Checking same location: " + (borewell1 == borewell2));
        System.out.println("borewell1 is same as borewell2: " + borewell1.equals(borewell2));
    }
}
