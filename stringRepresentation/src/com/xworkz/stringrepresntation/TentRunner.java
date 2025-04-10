package com.xworkz.stringrepresntation;

public class TentRunner {
    public static void main(String[] args) {
        Tent tent = new Tent("Green", 4, true);
        System.out.println("tent = " + tent.toString());

        int code = tent.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("camp = " + "camp".hashCode());
        System.out.println("sleep = " + "sleep".hashCode());
        System.out.println("shade = " + "shade".hashCode());
    }
}
