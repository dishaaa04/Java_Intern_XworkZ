package com.xworkz.stringrepresntation;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new Towel("Blue", "Cotton", 120.0);
        System.out.println("towel" + towel.toString());
    }
}
