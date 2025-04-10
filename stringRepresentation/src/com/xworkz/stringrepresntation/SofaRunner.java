package com.xworkz.stringrepresntation;

public class SofaRunner {
    public static void main(String[] args) {
        Sofa sofa = new Sofa("Leather", 3, true);
        System.out.println("sofa = " + sofa.toString());

        int code = sofa.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("comfort = " + "comfort".hashCode());
        System.out.println("seat = " + "seat".hashCode());
        System.out.println("lounge = " + "lounge".hashCode());
    }
}
