package com.xworkz.stringrepresntation;

public class ZooRunner {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Mysore Zoo", 1500, true);
        System.out.println("zoo = " + zoo.toString());

        int code = zoo.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("animal = " + "animal".hashCode());
        System.out.println("cage = " + "cage".hashCode());
        System.out.println("visit = " + "visit".hashCode());
    }
}
