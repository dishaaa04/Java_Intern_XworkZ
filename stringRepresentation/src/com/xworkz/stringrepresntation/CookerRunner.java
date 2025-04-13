package com.xworkz.stringrepresntation;

public class CookerRunner {
    public static void main(String[] args) {

        Cooker cooker1 = new Cooker();
        cooker1.setBrand("Prestige");

        Cooker cooker2 = new Cooker();
        cooker2.setBrand("Prestige");

        System.out.println("Checking same location: " + (cooker1 == cooker2));
        boolean same = cooker1.equals(cooker2);
        System.out.println("cooker1 is same as cooker2: " + same);
    }
}
