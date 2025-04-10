package com.xworkz.stringrepresntation;

public class KettleRunner {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Prestige", 1500, true);
        System.out.println("kettle = " + kettle.toString());

        int code = kettle.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("boil = " + "boil".hashCode());
        System.out.println("steam = " + "steam".hashCode());
        System.out.println("cordless = " + "cordless".hashCode());
    }
}
