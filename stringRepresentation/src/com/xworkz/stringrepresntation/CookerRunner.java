package com.xworkz.stringrepresntation;

public class CookerRunner {
    public static void main(String[] args) {
        Cooker cooker = new Cooker("Prestige", 5.0, false);
        System.out.println("cooker" + cooker.toString());
    }
}
