package com.xworkz.stringrepresntation;

public class TrayRunner {
    public static void main(String[] args) {
        Tray tray1 = new Tray();
        tray1.setMaterial("Plastic");
        tray1.setShape("Rectangle");
        tray1.setCompartments(5);

        Tray tray2 = new Tray();
        tray2.setMaterial("Plastic");
        tray2.setShape("Rectangle");
        tray2.setCompartments(5);

        System.out.println("Checking same location: " + (tray1 == tray2));
        boolean same = tray1.equals(tray2);
        System.out.println("tray1 is same as tray2: " + same);
    }
}
