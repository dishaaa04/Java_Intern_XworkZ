package com.xworkz.stringrepresntation;

public class AntennaRunner {
    public static void main(String[] args) {
        Antenna antenna = new Antenna("Yagi-Uda", 2.4, true);
        System.out.println("antenna" + antenna.toString());
    }
}
