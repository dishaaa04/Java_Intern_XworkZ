package com.xworkz.stringrepresntation;

public class ScissorsRunner {
    public static void main(String[] args) {
        Scissors scissors = new Scissors("Fiskars", 6.5, true);
        System.out.println("scissors = " + scissors.toString());

        int code = scissors.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("cut = " + "cut".hashCode());
        System.out.println("sharp = " + "sharp".hashCode());
        System.out.println("blade = " + "blade".hashCode());
    }
}
