package com.xworkz.stringrepresntation;

public class KettleRunner {
    public static void main(String[] args) {

        Kettle kettle1 = new Kettle();
        kettle1.setBrand("Prestige");
        kettle1.setCapacity(1500);

        Kettle kettle2 = new Kettle();
        kettle2.setBrand("Prestige");
        kettle2.setCapacity(1500);

        System.out.println("Checking same location: " + (kettle1 == kettle2));
        boolean same = kettle1.equals(kettle2);
        System.out.println("kettle1 is same as kettle2: " + same);
    }
}
