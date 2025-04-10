package com.xworkz.stringrepresntation;

public class TrayRunner {
    public static void main(String[] args) {
        Tray tray = new Tray("Plastic", 3, true);
        System.out.println("tray = " + tray.toString());

        int code = tray.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("food = " + "food".hashCode());
        System.out.println("serve = " + "serve".hashCode());
        System.out.println("dish = " + "dish".hashCode());
    }
}
