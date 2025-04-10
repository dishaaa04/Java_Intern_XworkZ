package com.xworkz.stringrepresntation;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung", 128, true);
        System.out.println("mobile = " + mobile.toString());

        int code = mobile.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("screen = " + "screen".hashCode());
        System.out.println("camera = " + "camera".hashCode());
        System.out.println("battery = " + "battery".hashCode());
    }
}
