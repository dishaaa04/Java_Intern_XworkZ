package com.xworkz.stringrepresntation;

public class TapRunner {
    public static void main(String[] args) {
        Tap tap = new Tap("Mixer", false, 15.5);
        System.out.println("tap = " + tap.toString());

        int code = tap.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("water = " + "water".hashCode());
        System.out.println("drip = " + "drip".hashCode());
        System.out.println("sink = " + "sink".hashCode());
    }
}
