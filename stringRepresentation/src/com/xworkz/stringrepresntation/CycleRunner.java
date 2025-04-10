package com.xworkz.stringrepresntation;

public class CycleRunner {
    public static void main(String[] args) {
        Cycle cycle = new Cycle("Hero", 6, true);
        System.out.println("cycle = " + cycle.toString());

        int code = cycle.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("handle = " + "handle".hashCode());
        System.out.println("brake = " + "brake".hashCode());
        System.out.println("pedal = " + "pedal".hashCode());
    }
}
