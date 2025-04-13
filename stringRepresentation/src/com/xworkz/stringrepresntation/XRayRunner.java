package com.xworkz.stringrepresntation;

public class XRayRunner {
    public static void main(String[] args) {
        XRay x1 = new XRay();
        x1.setBodyPart("Chest");

        XRay x2 = new XRay();
        x2.setBodyPart("Chest");

        System.out.println("Checking same location: " + (x1 == x2));
        boolean same = x1.equals(x2);
        System.out.println("x1 is same as x2: " + same);
    }
}
