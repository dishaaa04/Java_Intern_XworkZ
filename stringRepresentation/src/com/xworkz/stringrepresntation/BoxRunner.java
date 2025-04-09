package com.xworkz.stringrepresntation;

public class BoxRunner {
    public static void main(String[] args) {
        Box box = new Box("Rectangle", "Cardboard", 12.5);
        System.out.println("box" + box.toString());
    }
}
