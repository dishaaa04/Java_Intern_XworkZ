package com.xworkz.stringrepresntation;

public class LampRunner {
    public static void main(String[] args) {
        Lamp lamp = new Lamp("LED", 9, true);
        System.out.println("lamp = " + lamp.toString());

        int code = lamp.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("shade = " + "shade".hashCode());
        System.out.println("base = " + "base".hashCode());
        System.out.println("wire = " + "wire".hashCode());
    }
}
