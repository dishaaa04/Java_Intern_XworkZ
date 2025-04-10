package com.xworkz.stringrepresntation;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree("Mango", 25, true);
        System.out.println("tree = " + tree.toString());

        int code = tree.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("branch = " + "branch".hashCode());
        System.out.println("leaves = " + "leaves".hashCode());
        System.out.println("bark = " + "bark".hashCode());
    }
}
