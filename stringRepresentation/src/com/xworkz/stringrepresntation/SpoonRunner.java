package com.xworkz.stringrepresntation;

public class SpoonRunner {
    public static void main(String[] args) {
        Spoon spoon1 = new Spoon();
        spoon1.setMaterial("Steel");
        spoon1.setColor("Silver");
        spoon1.setLength(15.5);

        Spoon spoon2 = new Spoon();
        spoon2.setMaterial("Steel");
        spoon2.setColor("Silver");
        spoon2.setLength(15.5);

        System.out.println("Checking same location: " + (spoon1 == spoon2));
        boolean same = spoon1.equals(spoon2);
        System.out.println("spoon1 is same as spoon2: " + same);
    }
}
