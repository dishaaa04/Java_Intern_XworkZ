package com.xworkz.stringrepresntation;

public class OvenRunner {
    public static void main(String[] args) {
        Oven oven = new Oven("Convection", 30, true);
        System.out.println("oven" + oven.toString());
    }
}
