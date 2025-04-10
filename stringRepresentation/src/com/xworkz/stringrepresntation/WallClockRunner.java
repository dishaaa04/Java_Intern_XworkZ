package com.xworkz.stringrepresntation;

public class WallClockRunner {
    public static void main(String[] args) {
        WallClock clock = new WallClock("Round", "Titan", false);
        System.out.println("wallClock = " + clock.toString());

        int code = clock.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("time = " + "time".hashCode());
        System.out.println("tick = " + "tick".hashCode());
        System.out.println("second = " + "second".hashCode());
    }
}
