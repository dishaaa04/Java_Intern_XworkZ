package com.xworkz.stringrepresntation;

public class FanRunner {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setBrand("Usha");
        fan1.setSpeed(1200);

        Fan fan2 = new Fan();
        fan2.setBrand("Usha");
        fan2.setSpeed(1200);

        System.out.println("Checking same location: " + (fan1 == fan2));
        boolean same = fan1.equals(fan2);
        System.out.println("fan1 is same as fan2: " + same);
    }
}
