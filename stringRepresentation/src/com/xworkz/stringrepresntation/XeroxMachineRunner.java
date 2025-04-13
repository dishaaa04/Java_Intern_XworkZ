package com.xworkz.stringrepresntation;

public class XeroxMachineRunner {
    public static void main(String[] args) {
        XeroxMachine x1 = new XeroxMachine();
        x1.setBrand("Canon");

        XeroxMachine x2 = new XeroxMachine();
        x2.setBrand("Canon");

        System.out.println("Checking same location: " + (x1 == x2));
        boolean same = x1.equals(x2);
        System.out.println("x1 is same as x2: " + same);
    }
}
