package com.xworkz.stringrepresntation;

public class ToyRunner {
    public static void main(String[] args) {
        Toy toy = new Toy("Teddy Bear", "Soft Toy", 499.99);
        System.out.println("toy = " + toy.toString());

        int code = toy.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("fun = " + "fun".hashCode());
        System.out.println("play = " + "play".hashCode());
        System.out.println("child = " + "child".hashCode());
    }
}
