package com.xworkz.stringrepresntation;

public class MatRunner {
    public static void main(String[] args) {
        Mat mat = new Mat("Rubber", "6x4 ft", true);
        System.out.println("mat" + mat.toString());
    }
}
