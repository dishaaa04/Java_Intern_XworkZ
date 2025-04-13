package com.xworkz.stringrepresntation;

public class BulbRunner {
    public static void main(String[] args) {

        Bulb bulb1 = new Bulb();
        bulb1.setWattage("15W");

        Bulb bulb2 = new Bulb();
        bulb2.setWattage("15W");

        System.out.println("Checking same location: " + (bulb1 == bulb2));
        boolean same = bulb1.equals(bulb2);
        System.out.println("bulb1 is same as bulb2: " + same);
    }
}