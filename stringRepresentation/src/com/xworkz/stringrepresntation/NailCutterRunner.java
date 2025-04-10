package com.xworkz.stringrepresntation;

public class NailCutterRunner {
    public static void main(String[] args) {
        NailCutter cutter = new NailCutter("Stainless Steel", true, "Medium");
        System.out.println("nailCutter = " + cutter.toString());

        int code = cutter.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("clip = " + "clip".hashCode());
        System.out.println("edge = " + "edge".hashCode());
        System.out.println("trim = " + "trim".hashCode());
    }
}
