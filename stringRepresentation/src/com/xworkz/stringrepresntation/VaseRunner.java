package com.xworkz.stringrepresntation;

public class VaseRunner {
    public static void main(String[] args) {
        Vase vase = new Vase("Glass", 12.5, true);
        System.out.println("vase = " + vase.toString());

        int code = vase.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("flower = " + "flower".hashCode());
        System.out.println("ceramic = " + "ceramic".hashCode());
        System.out.println("pot = " + "pot".hashCode());
    }
}
