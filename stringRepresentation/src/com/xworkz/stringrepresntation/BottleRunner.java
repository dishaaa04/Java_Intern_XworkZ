package com.xworkz.stringrepresntation;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("Plastic", 1.5, true);
        System.out.println("bottle = " + bottle.toString());

        int code = bottle.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("drink = " + "drink".hashCode());
        System.out.println("cap = " + "cap".hashCode());
        System.out.println("label = " + "label".hashCode());
    }
}
