package com.xworkz.stringrepresntation;

public class NailCutterRunner {
    public static void main(String[] args) {

        NailCutter cutter1 = new NailCutter();
        cutter1.setBrand("Vega");
        cutter1.setMaterial("Steel");

        NailCutter cutter2 = new NailCutter();
        cutter2.setBrand("Vega");
        cutter2.setMaterial("Steel");

        System.out.println("Checking same location: " + (cutter1 == cutter2));
        boolean same = cutter1.equals(cutter2);
        System.out.println("cutter1 is same as cutter2: " + same);
    }
}
