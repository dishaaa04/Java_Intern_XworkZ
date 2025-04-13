package com.xworkz.stringrepresntation;

public class PencilRunner {
    public static void main(String[] args) {
        Pencil pencil1 = new Pencil();
        pencil1.setBrand("Nataraj");
        pencil1.setHardness("HB");

        Pencil pencil2 = new Pencil();
        pencil2.setBrand("Nataraj");
        pencil2.setHardness("HB");

        System.out.println("Checking same location: " + (pencil1 == pencil2));
        boolean same = pencil1.equals(pencil2);
        System.out.println("pencil1 is same as pencil2: " + same);
    }
}
