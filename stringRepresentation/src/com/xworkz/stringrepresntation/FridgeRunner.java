package com.xworkz.stringrepresntation;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("Samsung", 300, true);
        System.out.println("fridge = " + fridge.toString());

        int code = fridge.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("freezer = " + "freezer".hashCode());
        System.out.println("tray = " + "tray".hashCode());
        System.out.println("compressor = " + "compressor".hashCode());
    }
}
