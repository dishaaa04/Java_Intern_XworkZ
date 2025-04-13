package com.xworkz.stringrepresntation;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow1 = new Pillow();
        pillow1.setShape("Square");
        pillow1.setFabric("Cotton");

        Pillow pillow2 = new Pillow();
        pillow2.setShape("Square");
        pillow2.setFabric("Cotton");

        System.out.println("Checking same location: " + (pillow1 == pillow2));
        boolean same = pillow1.equals(pillow2);
        System.out.println("pillow1 is same as pillow2: " + same);
    }
}
