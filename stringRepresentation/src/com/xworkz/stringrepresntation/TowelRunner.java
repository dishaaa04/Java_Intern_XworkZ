package com.xworkz.stringrepresntation;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new Towel("Large", "White", true);
        System.out.println("towel = " + towel.toString());

        int code = towel.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("bath = " + "bath".hashCode());
        System.out.println("dry = " + "dry".hashCode());
        System.out.println("absorb = " + "absorb".hashCode());
    }
}
