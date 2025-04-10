package com.xworkz.stringrepresntation;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television tv = new Television("Sony", 55, true);
        System.out.println("television = " + tv.toString());

        int code = tv.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("screen = " + "screen".hashCode());
        System.out.println("remote = " + "remote".hashCode());
        System.out.println("channel = " + "channel".hashCode());
    }
}
