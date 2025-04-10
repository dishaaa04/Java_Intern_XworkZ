package com.xworkz.stringrepresntation;

public class StickRunner {
    public static void main(String[] args) {
        Stick stick = new Stick("Wood", 1.2, false);
        System.out.println("stick = " + stick.toString());

        int code = stick.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("branch = " + "branch".hashCode());
        System.out.println("cane = " + "cane".hashCode());
        System.out.println("rod = " + "rod".hashCode());
    }
}
