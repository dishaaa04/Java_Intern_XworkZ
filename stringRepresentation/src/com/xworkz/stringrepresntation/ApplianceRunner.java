package com.xworkz.stringrepresntation;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance("Samsung", "Microwave", 800);
        System.out.println("appliance" + appliance.toString());
    }
}
