package com.xworkz.stringrepresntation;

public class MouseRunner {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Optical", true, 1600);
        System.out.println("mouse = " + mouse.toString());

        int code = mouse.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("scroll = " + "scroll".hashCode());
        System.out.println("button = " + "button".hashCode());
        System.out.println("sensor = " + "sensor".hashCode());
    }
}
