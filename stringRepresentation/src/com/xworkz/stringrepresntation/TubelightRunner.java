package com.xworkz.stringrepresntation;

public class TubelightRunner {
    public static void main(String[] args) {
        Tubelight light = new Tubelight(36, "Philips", true);
        System.out.println("tubelight = " + light.toString());

        int code = light.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("bright = " + "bright".hashCode());
        System.out.println("tube = " + "tube".hashCode());
        System.out.println("glow = " + "glow".hashCode());
    }
}
