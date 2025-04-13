package com.xworkz.stringrepresntation;

public class SoapRunner {
    public static void main(String[] args) {
        Soap soap1 = new Soap();
        soap1.setBrand("Lux");
        soap1.setFragrance("Rose");
        soap1.setWeight(100.0);

        Soap soap2 = new Soap();
        soap2.setBrand("Lux");
        soap2.setFragrance("Rose");
        soap2.setWeight(100.0);

        System.out.println("Checking same location: " + (soap1 == soap2));
        boolean same = soap1.equals(soap2);
        System.out.println("soap1 is same as soap2: " + same);
    }
}
