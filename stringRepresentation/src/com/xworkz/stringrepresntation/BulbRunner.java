package com.xworkz.stringrepresntation;

public class BulbRunner {
    public static void main(String[] args) {
        Bulb bulb = new Bulb("Philips", 9, "LED");
        System.out.println("bulb" + bulb.toString());
    }
}
