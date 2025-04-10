package com.xworkz.stringrepresntation;

public class RingRunner {
    public static void main(String[] args) {
        Ring ring = new Ring("Gold", 6.5, true);
        System.out.println("ring = " + ring.toString());

        int code = ring.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("circle = " + "circle".hashCode());
        System.out.println("shine = " + "shine".hashCode());
        System.out.println("stone = " + "stone".hashCode());
    }
}
