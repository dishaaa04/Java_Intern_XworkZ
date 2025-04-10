package com.xworkz.stringrepresntation;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird = new Bird("Peacock", "Blue", true);
        String birdString = bird.toString();
        System.out.println("bird = " + birdString);

        int code = bird.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        String value = "wing";
        System.out.println("wing = " + value.hashCode());

        String value2 = "nest";
        System.out.println("nest = " + value2.hashCode());

        String value3 = "sky";
        System.out.println("sky = " + value3.hashCode());
    }
}
