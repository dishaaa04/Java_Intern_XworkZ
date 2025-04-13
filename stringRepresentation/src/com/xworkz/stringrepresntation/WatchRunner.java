package com.xworkz.stringrepresntation;

public class WatchRunner {
    public static void main(String[] args) {
        Watch w1 = new Watch();
        w1.setBrand("Fastrack");

        Watch w2 = new Watch();
        w2.setBrand("Fastrack");

        System.out.println("Checking same location: " + (w1 == w2));
        boolean same = w1.equals(w2);
        System.out.println("w1 is same as w2: " + same);
    }
}
