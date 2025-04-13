package com.xworkz.stringrepresntation;

public class JacketRunner {
    public static void main(String[] args) {

        Jacket jacket1 = new Jacket();
        jacket1.setMaterial("Leather");
        jacket1.setColor("Brown");

        Jacket jacket2 = new Jacket();
        jacket2.setMaterial("Leather");
        jacket2.setColor("Brown");

        System.out.println("Checking same location: " + (jacket1 == jacket2));
        boolean same = jacket1.equals(jacket2);
        System.out.println("jacket1 is same as jacket2: " + same);
    }
}
