package com.xworkz.stringrepresntation;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass = new Glass("Frosted", 10, true);
        System.out.println("glass = " + glass.toString());

        int code = glass.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("window = " + "window".hashCode());
        System.out.println("mirror = " + "mirror".hashCode());
        System.out.println("panel = " + "panel".hashCode());
    }
}
