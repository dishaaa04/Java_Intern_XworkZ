package com.xworkz.stringrepresntation;

public class PaintRunner {
    public static void main(String[] args) {
        Paint paint1 = new Paint();
        paint1.setColor("Blue");
        paint1.setFinish("Matte");

        Paint paint2 = new Paint();
        paint2.setColor("Blue");
        paint2.setFinish("Matte");

        System.out.println("Checking same location: " + (paint1 == paint2));
        boolean same = paint1.equals(paint2);
        System.out.println("paint1 is same as paint2: " + same);
    }
}
