package com.xworkz.stringrepresntation;

public class BoatRunner {
    public static void main(String[] args) {
        Boat boat = new Boat("Sailor", "Sailboat", 6);
        String boatString = boat.toString();
        System.out.println("boat = " + boatString);

        int code = boat.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        String value = "ocean";
        System.out.println("ocean = " + value.hashCode());

        String value2 = "anchor";
        System.out.println("anchor = " + value2.hashCode());

        String value3 = "wave";
        System.out.println("wave = " + value3.hashCode());
    }
}
