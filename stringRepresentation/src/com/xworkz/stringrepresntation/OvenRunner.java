package com.xworkz.stringrepresntation;

public class OvenRunner {
    public static void main(String[] args) {
        Oven oven = new Oven("Microwave", 28, true);
        System.out.println("oven = " + oven.toString());

        int code = oven.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("heat = " + "heat".hashCode());
        System.out.println("bake = " + "bake".hashCode());
        System.out.println("defrost = " + "defrost".hashCode());
    }
}
