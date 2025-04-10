package com.xworkz.stringrepresntation;

public class PlateRunner {
    public static void main(String[] args) {
        Plate plate = new Plate("Steel", "Round", 28.5);
        System.out.println("plate = " + plate.toString());

        int code = plate.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("fork = " + "fork".hashCode());
        System.out.println("spoon = " + "spoon".hashCode());
        System.out.println("bowl = " + "bowl".hashCode());
    }
}
