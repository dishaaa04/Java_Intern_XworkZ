package com.xworkz.stringrepresntation;

public class HelmetRunner {
    public static void main(String[] args) {

        Helmet helmet1 = new Helmet();
        helmet1.setBrand("Vega");
        helmet1.setColor("Black");

        Helmet helmet2 = new Helmet();
        helmet2.setBrand("Vega");
        helmet2.setColor("Black");

        System.out.println("Checking same location: " + (helmet1 == helmet2));
        boolean same = helmet1.equals(helmet2);
        System.out.println("helmet1 is same as helmet2: " + same);
    }
}
