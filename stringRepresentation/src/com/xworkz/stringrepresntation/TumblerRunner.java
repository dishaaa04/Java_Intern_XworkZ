package com.xworkz.stringrepresntation;

public class TumblerRunner {
    public static void main(String[] args) {
        Tumbler tumbler1 = new Tumbler();
        tumbler1.setMaterial("Steel");
        tumbler1.setCapacity(300.0);
        tumbler1.setColor("Silver");

        Tumbler tumbler2 = new Tumbler();
        tumbler2.setMaterial("Steel");
        tumbler2.setCapacity(300.0);
        tumbler2.setColor("Silver");

        System.out.println("Checking same location: " + (tumbler1 == tumbler2));
        boolean same = tumbler1.equals(tumbler2);
        System.out.println("tumbler1 is same as tumbler2: " + same);
    }
}
