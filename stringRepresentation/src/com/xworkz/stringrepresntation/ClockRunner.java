package com.xworkz.stringrepresntation;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock = new Clock("Wall", true, "Digital");
        System.out.println("clock = " + clock.toString());

        int code = clock.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("time = " + "time".hashCode());
        System.out.println("tick = " + "tick".hashCode());
        System.out.println("alarm = " + "alarm".hashCode());
    }
}
