package com.xworkz.stringrepresntation;

public class TubelightRunner {
    public static void main(String[] args) {
        Tubelight t1 = new Tubelight();
        t1.setBrand("Philips");
        t1.setWattage(36);
        t1.setLength(4.0);

        Tubelight t2 = new Tubelight();
        t2.setBrand("Philips");
        t2.setWattage(36);
        t2.setLength(4.0);

        System.out.println("Checking same location: " + (t1 == t2));
        boolean same = t1.equals(t2);
        System.out.println("t1 is same as t2: " + same);
    }
}
