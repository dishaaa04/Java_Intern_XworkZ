package com.xworkz.stringrepresntation;

public class PlateRunner {
    public static void main(String[] args) {
        Plate plate1 = new Plate();
        plate1.setMaterial("Ceramic");
        plate1.setShape("Round");

        Plate plate2 = new Plate();
        plate2.setMaterial("Ceramic");
        plate2.setShape("Round");

        System.out.println("Checking same location: " + (plate1 == plate2));
        boolean same = plate1.equals(plate2);
        System.out.println("plate1 is same as plate2: " + same);
    }
}
