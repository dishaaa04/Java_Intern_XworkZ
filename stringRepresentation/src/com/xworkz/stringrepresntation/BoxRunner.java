package com.xworkz.stringrepresntation;

public class BoxRunner {
    public static void main(String[] args) {
        Box box = new Box("Cube", "Red", 2.3);
        System.out.println("box = " + box.toString());

        int code = box.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("tape = " + "tape".hashCode());
        System.out.println("fold = " + "fold".hashCode());
        System.out.println("stack = " + "stack".hashCode());
    }
}
