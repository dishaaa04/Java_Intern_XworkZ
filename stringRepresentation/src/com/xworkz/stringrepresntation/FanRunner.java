package com.xworkz.stringrepresntation;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Usha", 5, true);
        System.out.println("fan = " + fan.toString());

        int code = fan.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("blades = " + "blades".hashCode());
        System.out.println("motor = " + "motor".hashCode());
        System.out.println("swing = " + "swing".hashCode());
    }
}
