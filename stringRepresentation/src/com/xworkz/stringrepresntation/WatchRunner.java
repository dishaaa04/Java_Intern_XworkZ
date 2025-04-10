package com.xworkz.stringrepresntation;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch("Analog", "Leather", false);
        System.out.println("watch = " + watch.toString());

        int code = watch.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("dial = " + "dial".hashCode());
        System.out.println("strap = " + "strap".hashCode());
        System.out.println("tick = " + "tick".hashCode());
    }
}
