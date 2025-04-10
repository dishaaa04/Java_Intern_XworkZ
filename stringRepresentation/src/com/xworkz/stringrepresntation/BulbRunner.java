package com.xworkz.stringrepresntation;

public class BulbRunner {
    public static void main(String[] args) {
        Bulb bulb = new Bulb(9, "Tube", true);
        System.out.println("bulb = " + bulb.toString());

        int code = bulb.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("switch = " + "switch".hashCode());
        System.out.println("light = " + "light".hashCode());
        System.out.println("energy = " + "energy".hashCode());
    }
}
