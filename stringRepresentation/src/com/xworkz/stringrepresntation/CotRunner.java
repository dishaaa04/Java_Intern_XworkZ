package com.xworkz.stringrepresntation;

public class CotRunner {
    public static void main(String[] args) {

        Cot cot1 = new Cot();
        cot1.setWoodType("Teak");

        Cot cot2 = new Cot();
        cot2.setWoodType("Teak");

        System.out.println("Checking same location: " + (cot1 == cot2));
        boolean same = cot1.equals(cot2);
        System.out.println("cot1 is same as cot2: " + same);
    }
}
