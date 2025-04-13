package com.xworkz.stringrepresntation;

public class LaptopRunner {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Dell");
        laptop1.setRam(16);

        Laptop laptop2 = new Laptop();
        laptop2.setBrand("Dell");
        laptop2.setRam(16);

        System.out.println("Checking same location: " + (laptop1 == laptop2));
        boolean same = laptop1.equals(laptop2);
        System.out.println("laptop1 is same as laptop2: " + same);
    }
}
