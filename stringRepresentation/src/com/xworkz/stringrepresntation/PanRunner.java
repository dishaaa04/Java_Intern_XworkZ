package com.xworkz.stringrepresntation;

public class PanRunner {
    public static void main(String[] args) {
        Pan pan = new Pan("Aluminum", 28.0, true);
        System.out.println("pan" + pan.toString());
    }
}
