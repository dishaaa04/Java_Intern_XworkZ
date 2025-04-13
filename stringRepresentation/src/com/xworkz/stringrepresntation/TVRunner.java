package com.xworkz.stringrepresntation;

public class TVRunner {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.setBrand("Samsung");
        tv1.setType("LED");
        tv1.setScreenSize(55);

        TV tv2 = new TV();
        tv2.setBrand("Samsung");
        tv2.setType("LED");
        tv2.setScreenSize(55);

        System.out.println("Checking same location: " + (tv1 == tv2));
        boolean same = tv1.equals(tv2);
        System.out.println("tv1 is same as tv2: " + same);
    }
}
