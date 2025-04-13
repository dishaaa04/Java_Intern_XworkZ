package com.xworkz.stringrepresntation;

public class KeyboardRunner {
    public static void main(String[] args) {

        Keyboard keyboard1 = new Keyboard();
        keyboard1.setLayout("QWERTY");
        keyboard1.setWireless(true);

        Keyboard keyboard2 = new Keyboard();
        keyboard2.setLayout("QWERTY");
        keyboard2.setWireless(true);

        System.out.println("Checking same location: " + (keyboard1 == keyboard2));
        boolean same = keyboard1.equals(keyboard2);
        System.out.println("keyboard1 is same as keyboard2: " + same);
    }
}
