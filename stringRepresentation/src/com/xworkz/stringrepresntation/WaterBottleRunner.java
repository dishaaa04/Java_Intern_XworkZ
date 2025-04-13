package com.xworkz.stringrepresntation;

public class WaterBottleRunner {
    public static void main(String[] args) {
        WaterBottle b1 = new WaterBottle();
        b1.setCapacity("1L");

        WaterBottle b2 = new WaterBottle();
        b2.setCapacity("1L");

        System.out.println("Checking same location: " + (b1 == b2));
        boolean same = b1.equals(b2);
        System.out.println("b1 is same as b2: " + same);
    }
}
