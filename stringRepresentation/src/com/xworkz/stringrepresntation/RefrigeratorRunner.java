package com.xworkz.stringrepresntation;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator("Samsung", 260, true);
        System.out.println("refrigerator" + refrigerator.toString());
    }
}
