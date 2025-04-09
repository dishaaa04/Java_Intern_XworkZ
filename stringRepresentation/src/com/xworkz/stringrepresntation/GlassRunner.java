package com.xworkz.stringrepresntation;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass = new Glass("Wine Glass", 250, true);
        System.out.println("glass" + glass.toString());
    }
}
