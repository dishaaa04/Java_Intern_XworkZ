package com.xworkz.stringrepresntation;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", 24, true);
        System.out.println("camera = " + camera.toString());

        int code = camera.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("lens = " + "lens".hashCode());
        System.out.println("shutter = " + "shutter".hashCode());
        System.out.println("zoom = " + "zoom".hashCode());
    }
}
