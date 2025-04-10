package com.xworkz.stringrepresntation;

public class PencilRunner {
    public static void main(String[] args) {
        Pencil pencil = new Pencil("Apsara", "HB", true);
        System.out.println("pencil = " + pencil.toString());

        int code = pencil.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("write = " + "write".hashCode());
        System.out.println("draw = " + "draw".hashCode());
        System.out.println("erase = " + "erase".hashCode());
    }
}
