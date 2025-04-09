package com.xworkz.stringrepresntation;

public class CloudServiceRunner {
    public static void main(String[] args) {
        CloudService cloud = new CloudService("AWS", "ap-south-1", true);
        System.out.println("cloudService" + cloud.toString());
    }
}
