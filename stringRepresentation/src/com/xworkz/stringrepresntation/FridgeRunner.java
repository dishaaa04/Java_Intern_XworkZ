package com.xworkz.stringrepresntation;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("LG", 260, true);
        System.out.println("fridge" + fridge.toString());
    }
}
