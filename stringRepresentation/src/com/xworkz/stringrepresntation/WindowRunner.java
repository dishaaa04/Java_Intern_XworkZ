package com.xworkz.stringrepresntation;

public class WindowRunner {
    public static void main(String[] args) {
        Window window = new Window("Aluminium", 4, true);
        System.out.println("window = " + window.toString());

        int code = window.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("open = " + "open".hashCode());
        System.out.println("glass = " + "glass".hashCode());
        System.out.println("frame = " + "frame".hashCode());
    }
}
