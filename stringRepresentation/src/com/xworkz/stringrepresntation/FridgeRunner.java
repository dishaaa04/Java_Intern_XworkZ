package com.xworkz.stringrepresntation;

public class FridgeRunner {
    public static void main(String[] args) {

        Fridge fridge1 = new Fridge();
        fridge1.setModel("SamsungDoubleDoor");
        fridge1.setCapacity(340);

        Fridge fridge2 = new Fridge();
        fridge2.setModel("SamsungDoubleDoor");
        fridge2.setCapacity(340);

        System.out.println("Checking same location: " + (fridge1 == fridge2));
        boolean same = fridge1.equals(fridge2);
        System.out.println("fridge1 is same as fridge2: " + same);
    }
}
