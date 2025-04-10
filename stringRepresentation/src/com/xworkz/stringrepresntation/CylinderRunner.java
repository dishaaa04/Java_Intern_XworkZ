package com.xworkz.stringrepresntation;

public class CylinderRunner {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder("LPG", 14.2, true);
        System.out.println("cylinder = " + cylinder.toString());

        int code = cylinder.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("valve = " + "valve".hashCode());
        System.out.println("pipe = " + "pipe".hashCode());
        System.out.println("seal = " + "seal".hashCode());
    }
}
