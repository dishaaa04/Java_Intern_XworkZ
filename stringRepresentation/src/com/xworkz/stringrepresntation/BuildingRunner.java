package com.xworkz.stringrepresntation;

public class BuildingRunner {
    public static void main(String[] args) {

        Building building1 = new Building();
        building1.setUsage("Commercial");

        Building building2 = new Building();
        building2.setUsage("Commercial");

        System.out.println("Checking same location: " + (building1 == building2));
        boolean same = building1.equals(building2);
        System.out.println("building1 is same as building2: " + same);
    }
}