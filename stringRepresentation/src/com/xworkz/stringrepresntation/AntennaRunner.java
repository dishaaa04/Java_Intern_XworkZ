package com.xworkz.stringrepresntation;

public class AntennaRunner {
    public static void main(String[] args) {
        Antenna antenna = new Antenna("Yagi", 98.5, 120);
        String antennaString = antenna.toString();
        System.out.println("antenna = " + antennaString);

        int code = antenna.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        String value = "signal";
        System.out.println("signal = " + value.hashCode());

        String value2 = "transmit";
        System.out.println("transmit = " + value2.hashCode());

        String value3 = "receiver";
        System.out.println("receiver = " + value3.hashCode());
    }
}
