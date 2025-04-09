package com.xworkz.stringrepresntation;

public class SoapRunner {
    public static void main(String[] args) {
        Soap soap = new Soap("Dove", "Rose", 125.0);
        System.out.println("soap" + soap.toString());
    }
}
