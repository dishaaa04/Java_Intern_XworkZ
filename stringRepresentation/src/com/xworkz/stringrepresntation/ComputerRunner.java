package com.xworkz.stringrepresntation;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", 16, "Intel i7");
        System.out.println("computer = " + computer.toString());

        int code = computer.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("desktop = " + "desktop".hashCode());
        System.out.println("laptop = " + "laptop".hashCode());
        System.out.println("monitor = " + "monitor".hashCode());
    }
}
