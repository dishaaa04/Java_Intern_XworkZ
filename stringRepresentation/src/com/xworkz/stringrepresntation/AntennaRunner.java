package com.xworkz.stringrepresntation;

public class AntennaRunner {
    public static void main(String[] args) {

        Antenna antenna1 = new Antenna();
        antenna1.setFrequencyRange("700MHz - 2.5GHz");

        Antenna antenna2 = new Antenna();
        antenna2.setFrequencyRange("700MHz - 2.5GHz");

        System.out.println("Checking same location: " + (antenna1 == antenna2));
        System.out.println("antenna1 is same as antenna2: " + antenna1.equals(antenna2));
    }
}
