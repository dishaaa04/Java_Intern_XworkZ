package com.xworkz.stringrepresntation;

public class CotRunner {
    public static void main(String[] args) {
        Cot cot = new Cot("Wood", 4, true);
        System.out.println("cot = " + cot.toString());

        int code = cot.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("bed = " + "bed".hashCode());
        System.out.println("pillow = " + "pillow".hashCode());
        System.out.println("blanket = " + "blanket".hashCode());
    }
}
