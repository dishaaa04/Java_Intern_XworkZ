package com.xworkz.stringrepresntation;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance("LG", "Washing Machine", 1500);
        String applianceString = appliance.toString();
        System.out.println("appliance = " + applianceString);

        int code = appliance.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        String value = "voltage";
        System.out.println("voltage = " + value.hashCode());

        String value2 = "switch";
        System.out.println("switch = " + value2.hashCode());

        String value3 = "circuit";
        System.out.println("circuit = " + value3.hashCode());
    }
}
