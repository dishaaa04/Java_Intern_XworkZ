package com.xworkz.stringrepresntation;

public class WaterBottleRunner {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle("Steel", 1.0, true);
        System.out.println("waterBottle = " + bottle.toString());

        int code = bottle.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("hydration = " + "hydration".hashCode());
        System.out.println("sip = " + "sip".hashCode());
        System.out.println("flask = " + "flask".hashCode());
    }
}
