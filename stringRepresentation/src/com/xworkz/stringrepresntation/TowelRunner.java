package com.xworkz.stringrepresntation;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel1 = new Towel();
        towel1.setSize("Large");
        towel1.setMaterial("Cotton");
        towel1.setColor("White");

        Towel towel2 = new Towel();
        towel2.setSize("Large");
        towel2.setMaterial("Cotton");
        towel2.setColor("White");

        System.out.println("Checking same location: " + (towel1 == towel2));
        boolean same = towel1.equals(towel2);
        System.out.println("towel1 is same as towel2: " + same);
    }
}
