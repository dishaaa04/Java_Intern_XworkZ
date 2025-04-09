package com.xworkz.stringrepresntation;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television television = new Television("LG", 55, true);
        System.out.println("television" + television.toString());
    }
}
