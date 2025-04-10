package com.xworkz.stringrepresntation;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building = new Building("Apartment", 10, true);
        System.out.println("building = " + building.toString());

        int code = building.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("roof = " + "roof".hashCode());
        System.out.println("door = " + "door".hashCode());
        System.out.println("window = " + "window".hashCode());
    }
}
