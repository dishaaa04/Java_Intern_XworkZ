package com.xworkz.stringrepresntation;

public class TumblerRunner {
    public static void main(String[] args) {
        Tumbler tumbler = new Tumbler("Steel", 350.0, false);
        System.out.println("tumbler = " + tumbler.toString());

        int code = tumbler.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("cup = " + "cup".hashCode());
        System.out.println("glass = " + "glass".hashCode());
        System.out.println("sip = " + "sip".hashCode());
    }
}
