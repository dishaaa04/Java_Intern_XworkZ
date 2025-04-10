package com.xworkz.stringrepresntation;

public class PanRunner {
    public static void main(String[] args) {
        Pan pan = new Pan("Aluminum", 24, true);
        System.out.println("pan = " + pan.toString());

        int code = pan.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("cook = " + "cook".hashCode());
        System.out.println("stove = " + "stove".hashCode());
        System.out.println("fry = " + "fry".hashCode());
    }
}
