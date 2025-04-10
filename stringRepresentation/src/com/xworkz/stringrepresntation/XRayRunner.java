package com.xworkz.stringrepresntation;

public class XRayRunner {
    public static void main(String[] args) {
        XRay xray = new XRay("Chest", true, 1200.0);
        System.out.println("xray = " + xray.toString());

        int code = xray.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("scan = " + "scan".hashCode());
        System.out.println("bone = " + "bone".hashCode());
        System.out.println("image = " + "image".hashCode());
    }
}
