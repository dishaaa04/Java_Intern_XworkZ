package com.xworkz.stringrepresntation;

public class XylophoneRunner {
    public static void main(String[] args) {
        Xylophone xylo = new Xylophone(12, "Wood", true);
        System.out.println("xylophone = " + xylo.toString());

        int code = xylo.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("note = " + "note".hashCode());
        System.out.println("sound = " + "sound".hashCode());
        System.out.println("melody = " + "melody".hashCode());
    }
}
