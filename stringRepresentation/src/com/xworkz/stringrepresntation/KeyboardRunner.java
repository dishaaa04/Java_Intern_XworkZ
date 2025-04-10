package com.xworkz.stringrepresntation;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Mechanical", true, 104);
        System.out.println("keyboard = " + keyboard.toString());

        int code = keyboard.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("keys = " + "keys".hashCode());
        System.out.println("layout = " + "layout".hashCode());
        System.out.println("switches = " + "switches".hashCode());
    }
}
