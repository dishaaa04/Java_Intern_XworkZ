package com.xworkz.stringrepresntation;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "Intel i7", 16);
        System.out.println("laptop = " + laptop.toString());

        int code = laptop.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("keyboard = " + "keyboard".hashCode());
        System.out.println("screen = " + "screen".hashCode());
        System.out.println("battery = " + "battery".hashCode());
    }
}
