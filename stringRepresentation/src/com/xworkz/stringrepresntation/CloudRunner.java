package com.xworkz.stringrepresntation;

public class CloudRunner {
    public static void main(String[] args) {

        Cloud cloud1 = new Cloud();
        cloud1.setProvider("AWS");

        Cloud cloud2 = new Cloud();
        cloud2.setProvider("AWS");

        System.out.println("Checking same location: " + (cloud1 == cloud2));
        boolean same = cloud1.equals(cloud2);
        System.out.println("cloud1 is same as cloud2: " + same);
    }
}
