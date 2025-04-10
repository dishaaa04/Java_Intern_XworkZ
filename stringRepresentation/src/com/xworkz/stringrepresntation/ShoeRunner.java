package com.xworkz.stringrepresntation;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe = new Shoe("Nike", 9, true);
        System.out.println("shoe = " + shoe.toString());

        int code = shoe.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("walk = " + "walk".hashCode());
        System.out.println("run = " + "run".hashCode());
        System.out.println("leather = " + "leather".hashCode());
    }
}
