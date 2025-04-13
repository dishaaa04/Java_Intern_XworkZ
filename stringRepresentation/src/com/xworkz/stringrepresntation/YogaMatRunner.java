package com.xworkz.stringrepresntation;

public class YogaMatRunner {
    public static void main(String[] args) {
        YogaMat y1 = new YogaMat();
        y1.setColor("Purple");

        YogaMat y2 = new YogaMat();
        y2.setColor("Purple");

        System.out.println("Checking same location: " + (y1 == y2));
        boolean same = y1.equals(y2);
        System.out.println("y1 is same as y2: " + same);
    }
}
