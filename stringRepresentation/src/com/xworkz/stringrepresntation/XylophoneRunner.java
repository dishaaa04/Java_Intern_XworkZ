package com.xworkz.stringrepresntation;

public class XylophoneRunner {
    public static void main(String[] args) {
        Xylophone x1 = new Xylophone();
        x1.setMaterial("Wood");

        Xylophone x2 = new Xylophone();
        x2.setMaterial("Wood");

        System.out.println("Checking same location: " + (x1 == x2));
        boolean same = x1.equals(x2);
        System.out.println("x1 is same as x2: " + same);
    }
}
