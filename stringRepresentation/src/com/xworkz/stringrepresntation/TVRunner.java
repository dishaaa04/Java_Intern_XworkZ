package com.xworkz.stringrepresntation;

public class TVRunner {
    public static void main(String[] args) {
        TV tv = new TV("Samsung", 43, true);
        System.out.println("tv = " + tv.toString());

        int code = tv.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("remote = " + "remote".hashCode());
        System.out.println("LED = " + "LED".hashCode());
        System.out.println("display = " + "display".hashCode());
    }
}
