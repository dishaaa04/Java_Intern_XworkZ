package com.xworkz.stringrepresntation;

public class ZebraRunner {
    public static void main(String[] args) {
        Zebra zebra = new Zebra("Savannah", 5, true);
        System.out.println("zebra = " + zebra.toString());

        int code = zebra.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("stripes = " + "stripes".hashCode());
        System.out.println("grassland = " + "grassland".hashCode());
        System.out.println("herbivore = " + "herbivore".hashCode());
    }
}
