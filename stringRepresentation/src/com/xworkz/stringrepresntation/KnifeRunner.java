package com.xworkz.stringrepresntation;

public class KnifeRunner {
    public static void main(String[] args) {
        Knife knife = new Knife("Stainless Steel", 15, true);
        System.out.println("knife = " + knife.toString());

        int code = knife.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("blade = " + "blade".hashCode());
        System.out.println("handle = " + "handle".hashCode());
        System.out.println("grip = " + "grip".hashCode());
    }
}
