package com.xworkz.stringrepresntation;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        Refrigerator ref1 = new Refrigerator();
        ref1.setBrand("Samsung");
        ref1.setCapacity(340);
        ref1.setDoubleDoor(true);

        Refrigerator ref2 = new Refrigerator();
        ref2.setBrand("Samsung");
        ref2.setCapacity(340);
        ref2.setDoubleDoor(true);

        System.out.println("Checking same location: " + (ref1 == ref2));
        boolean same = ref1.equals(ref2);
        System.out.println("ref1 is same as ref2: " + same);
    }
}
