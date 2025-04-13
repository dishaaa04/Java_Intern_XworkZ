package com.xworkz.stringrepresntation;

public class ComputerRunner {
    public static void main(String[] args) {

        Computer computer1 = new Computer();
        computer1.setProcessor("Intel i7");

        Computer computer2 = new Computer();
        computer2.setProcessor("Intel i7");

        System.out.println("Checking same location: " + (computer1 == computer2));
        boolean same = computer1.equals(computer2);
        System.out.println("computer1 is same as computer2: " + same);
    }
}
