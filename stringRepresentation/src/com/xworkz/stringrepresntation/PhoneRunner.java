package com.xworkz.stringrepresntation;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "Galaxy A52", 6.5);
        System.out.println("phone = " + phone.toString());

        int code = phone.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("call = " + "call".hashCode());
        System.out.println("text = " + "text".hashCode());
        System.out.println("camera = " + "camera".hashCode());
    }
}
