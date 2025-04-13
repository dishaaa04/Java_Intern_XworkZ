package com.xworkz.stringrepresntation;

public class IronRunner {
    public static void main(String[] args) {

        Iron iron1 = new Iron();
        iron1.setBrand("Philips");
        iron1.setType("Dry");

        Iron iron2 = new Iron();
        iron2.setBrand("Philips");
        iron2.setType("Dry");

        System.out.println("Checking same location: " + (iron1 == iron2));
        boolean same = iron1.equals(iron2);
        System.out.println("iron1 is same as iron2: " + same);
    }
}
