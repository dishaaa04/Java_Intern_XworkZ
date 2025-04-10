package com.xworkz.stringrepresntation;

public class MatRunner {
    public static void main(String[] args) {
        Mat mat = new Mat("Coir", "Brown", true);
        System.out.println("mat = " + mat.toString());

        int code = mat.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("floor = " + "floor".hashCode());
        System.out.println("texture = " + "texture".hashCode());
        System.out.println("border = " + "border".hashCode());
    }
}
