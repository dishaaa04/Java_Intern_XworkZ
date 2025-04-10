package com.xworkz.stringrepresntation;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator("LG", 260, true);
        System.out.println("fridge = " + fridge.toString());

        int code = fridge.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("cool = " + "cool".hashCode());
        System.out.println("freeze = " + "freeze".hashCode());
        System.out.println("chill = " + "chill".hashCode());
    }
}
