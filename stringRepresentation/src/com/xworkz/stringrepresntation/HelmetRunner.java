package com.xworkz.stringrepresntation;

public class HelmetRunner {
    public static void main(String[] args) {
        Helmet helmet = new Helmet("Studds", "M", true);
        System.out.println("helmet = " + helmet.toString());

        int code = helmet.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("visor = " + "visor".hashCode());
        System.out.println("strap = " + "strap".hashCode());
        System.out.println("padding = " + "padding".hashCode());
    }
}
