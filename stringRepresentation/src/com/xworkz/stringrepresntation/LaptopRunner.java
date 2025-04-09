package com.xworkz.stringrepresntation;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP", 8, "Intel i5");
        System.out.println("laptop" + laptop.toString());
    }
}

