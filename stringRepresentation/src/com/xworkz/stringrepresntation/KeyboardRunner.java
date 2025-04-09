package com.xworkz.stringrepresntation;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Logitech", true, "QWERTY");
        System.out.println("keyboard" + keyboard.toString());
    }
}
