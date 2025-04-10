package com.xworkz.stringrepresntation;

public class SoapRunner {
    public static void main(String[] args) {
        Soap soap = new Soap("Lavender", 100.0, false);
        System.out.println("soap = " + soap.toString());

        int code = soap.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("clean = " + "clean".hashCode());
        System.out.println("fresh = " + "fresh".hashCode());
        System.out.println("bubbles = " + "bubbles".hashCode());
    }
}
