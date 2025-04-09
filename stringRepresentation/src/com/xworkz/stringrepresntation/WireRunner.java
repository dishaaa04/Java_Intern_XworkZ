package com.xworkz.stringrepresntation;

public class WireRunner {
    public static void main(String[] args) {
        Wire wire = new Wire("Electrical", 20.0, true);
        System.out.println("wire" + wire.toString());
    }
}
