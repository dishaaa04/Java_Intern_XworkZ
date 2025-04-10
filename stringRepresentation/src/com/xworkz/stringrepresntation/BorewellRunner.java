package com.xworkz.stringrepresntation;

public class BorewellRunner {
    public static void main(String[] args) {
        Borewell borewell = new Borewell("Mysore", 350, true);
        String borewellString = borewell.toString();
        System.out.println("borewell = " + borewellString);

        int code = borewell.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        String value = "pump";
        System.out.println("pump = " + value.hashCode());

        String value2 = "pipe";
        System.out.println("pipe = " + value2.hashCode());

        String value3 = "water";
        System.out.println("water = " + value3.hashCode());
    }
}
