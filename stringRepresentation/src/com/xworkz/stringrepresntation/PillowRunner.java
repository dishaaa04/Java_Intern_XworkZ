package com.xworkz.stringrepresntation;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow = new Pillow("Cotton", "Standard", true);
        System.out.println("pillow" + pillow.toString());
    }
}
