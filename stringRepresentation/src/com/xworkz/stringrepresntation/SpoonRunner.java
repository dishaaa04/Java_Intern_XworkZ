package com.xworkz.stringrepresntation;

public class SpoonRunner {
    public static void main(String[] args) {
        Spoon spoon = new Spoon("Steel", "Teaspoon", 14.0);
        System.out.println("spoon = " + spoon.toString());

        int code = spoon.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("dish = " + "dish".hashCode());
        System.out.println("serve = " + "serve".hashCode());
        System.out.println("eat = " + "eat".hashCode());
    }
}
