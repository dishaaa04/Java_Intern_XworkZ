package com.xworkz.stringrepresntation;

public class KnifeRunner {
    public static void main(String[] args) {
        Knife knife = new Knife("Chef's Knife", 20.5, true);
        System.out.println("knife" + knife.toString());
    }
}
