package com.xworkz.stringrepresntation;

public class ThreadRunner {
    public static void main(String[] args) {
        Thread thread = new Thread("Red", 200.5, "Cotton");
        System.out.println("thread = " + thread.toString());

        int code = thread.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("sewing = " + "sewing".hashCode());
        System.out.println("needle = " + "needle".hashCode());
        System.out.println("bobbin = " + "bobbin".hashCode());
    }
}
