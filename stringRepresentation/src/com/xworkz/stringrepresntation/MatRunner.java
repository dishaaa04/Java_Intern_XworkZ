package com.xworkz.stringrepresntation;

public class MatRunner {
    public static void main(String[] args) {

        Mat mat1 = new Mat();
        mat1.setMaterial("Cotton");
        mat1.setLength(5.0);

        Mat mat2 = new Mat();
        mat2.setMaterial("Cotton");
        mat2.setLength(5.0);

        System.out.println("Checking same location: " + (mat1 == mat2));
        boolean same = mat1.equals(mat2);
        System.out.println("mat1 is same as mat2: " + same);
    }
}
