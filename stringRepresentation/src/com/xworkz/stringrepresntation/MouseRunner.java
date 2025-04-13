package com.xworkz.stringrepresntation;

public class MouseRunner {
    public static void main(String[] args) {

        Mouse mouse1 = new Mouse();
        mouse1.setType("Optical");
        mouse1.setWireless(true);

        Mouse mouse2 = new Mouse();
        mouse2.setType("Optical");
        mouse2.setWireless(true);

        System.out.println("Checking same location: " + (mouse1 == mouse2));
        boolean same = mouse1.equals(mouse2);
        System.out.println("mouse1 is same as mouse2: " + same);
    }
}
