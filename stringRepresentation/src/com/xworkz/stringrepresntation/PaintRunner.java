package com.xworkz.stringrepresntation;

public class PaintRunner {
    public static void main(String[] args) {
        Paint paint = new Paint("Red", "Acrylic", 150.75);
        System.out.println("paint = " + paint.toString());

        int code = paint.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("brush = " + "brush".hashCode());
        System.out.println("canvas = " + "canvas".hashCode());
        System.out.println("shade = " + "shade".hashCode());
    }
}
