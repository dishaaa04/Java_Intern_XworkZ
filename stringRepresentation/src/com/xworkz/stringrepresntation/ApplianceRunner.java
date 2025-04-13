package com.xworkz.stringrepresntation;

public class ApplianceRunner {
    public static void main(String[] args) {

        Appliance appliance1 = new Appliance();
        appliance1.setType("Washing Machine");

        Appliance appliance2 = new Appliance();
        appliance2.setType("Washing Machine");

        System.out.println("Checking same location: " + (appliance1 == appliance2));
        System.out.println("appliance1 is same as appliance2: " + appliance1.equals(appliance2));
    }
}
