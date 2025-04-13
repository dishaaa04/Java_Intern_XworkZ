package com.xworkz.stringrepresntation;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setBrand("Sony");
        tv1.setSize(55);
        tv1.setSmart(true);

        Television tv2 = new Television();
        tv2.setBrand("Sony");
        tv2.setSize(55);
        tv2.setSmart(true);

        System.out.println("Checking same location: " + (tv1 == tv2));
        boolean same = tv1.equals(tv2);
        System.out.println("tv1 is same as tv2: " + same);
    }
}
