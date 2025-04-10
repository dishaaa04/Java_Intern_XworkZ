package com.xworkz.stringrepresntation;

public class JacketRunner {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("Leather", "L", false);
        System.out.println("jacket = " + jacket.toString());

        int code = jacket.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("zipper = " + "zipper".hashCode());
        System.out.println("hood = " + "hood".hashCode());
        System.out.println("pocket = " + "pocket".hashCode());
    }
}
