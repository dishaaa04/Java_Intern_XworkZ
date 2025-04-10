package com.xworkz.stringrepresntation;

public class WireRunner {
    public static void main(String[] args) {
        Wire wire = new Wire("Copper", 100.0, true);
        System.out.println("wire = " + wire.toString());

        int code = wire.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("current = " + "current".hashCode());
        System.out.println("coil = " + "coil".hashCode());
        System.out.println("cable = " + "cable".hashCode());
    }
}
