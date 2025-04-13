package com.xworkz.stringrepresntation;

public class OperatingSystemRunner {
    public static void main(String[] args) {
        OperatingSystem os1 = new OperatingSystem();
        os1.setName("Windows");
        os1.setVersion(11);

        OperatingSystem os2 = new OperatingSystem();
        os2.setName("Windows");
        os2.setVersion(11);

        System.out.println("Checking same location: " + (os1 == os2));
        boolean same = os1.equals(os2);
        System.out.println("os1 is same as os2: " + same);
    }
}
