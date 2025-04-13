package com.xworkz.stringrepresntation;

public class WindowRunner {
    public static void main(String[] args) {
        Window w1 = new Window();
        w1.setFrameType("Aluminium");

        Window w2 = new Window();
        w2.setFrameType("Aluminium");

        System.out.println("Checking same location: " + (w1 == w2));
        boolean same = w1.equals(w2);
        System.out.println("w1 is same as w2: " + same);
    }
}
