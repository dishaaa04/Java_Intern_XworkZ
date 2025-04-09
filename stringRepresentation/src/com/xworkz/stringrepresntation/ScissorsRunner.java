package com.xworkz.stringrepresntation;

public class ScissorsRunner {
    public static void main(String[] args) {
        Scissors scissors = new Scissors("Fiskars", "Office", 15.0);
        System.out.println("scissors" + scissors.toString());
    }
}
