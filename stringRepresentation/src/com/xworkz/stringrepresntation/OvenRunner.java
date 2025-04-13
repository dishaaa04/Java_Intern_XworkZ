package com.xworkz.stringrepresntation;

public class OvenRunner {
    public static void main(String[] args) {
        Oven oven1 = new Oven();
        oven1.setType("Microwave");
        oven1.setTemperature(250);

        Oven oven2 = new Oven();
        oven2.setType("Microwave");
        oven2.setTemperature(250);

        System.out.println("Checking same location: " + (oven1 == oven2));
        boolean same = oven1.equals(oven2);
        System.out.println("oven1 is same as oven2: " + same);
    }
}
