package com.xworkz.stringrepresntation;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow = new Pillow("Cotton", "King", true);
        System.out.println("pillow = " + pillow.toString());

        int code = pillow.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("sleep = " + "sleep".hashCode());
        System.out.println("rest = " + "rest".hashCode());
        System.out.println("nap = " + "nap".hashCode());
    }
}
