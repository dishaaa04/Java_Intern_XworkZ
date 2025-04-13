package com.xworkz.stringrepresntation;

public class BoxRunner {
    public static void main(String[] args) {

        Box box1 = new Box();
        box1.setShape("Rectangle");

        Box box2 = new Box();
        box2.setShape("Rectangle");

        System.out.println("Checking same location: " + (box1 == box2));
        boolean same = box1.equals(box2);
        System.out.println("box1 is same as box2: " + same);
    }
}
