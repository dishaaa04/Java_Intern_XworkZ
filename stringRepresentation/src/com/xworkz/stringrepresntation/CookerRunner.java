package com.xworkz.stringrepresntation;

public class CookerRunner {
    public static void main(String[] args) {
        Cooker cooker = new Cooker("Pressure", 5, false);
        System.out.println("cooker = " + cooker.toString());

        int code = cooker.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("steam = " + "steam".hashCode());
        System.out.println("lid = " + "lid".hashCode());
        System.out.println("gas = " + "gas".hashCode());
    }
}
