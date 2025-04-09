package com.xworkz.stringrepresntation;

public class LampRunner {
    public static void main(String[] args) {
        Lamp lamp = new Lamp("Table Lamp", "White", true);
        System.out.println("lamp" + lamp.toString());
    }
}
