package com.xworkz.stringrepresntation;

public class BoatRunner {
    public static void main(String[] args) {

        Boat boat1 = new Boat();
        boat1.setType("Fishing");

        Boat boat2 = new Boat();
        boat2.setType("Fishing");

        System.out.println("Checking same location: " + (boat1 == boat2));
        System.out.println("boat1 is same as boat2: " + boat1.equals(boat2));
    }
}
