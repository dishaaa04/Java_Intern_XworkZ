package com.xworkz.stringrepresntation;

public class CloudRunner {
    public static void main(String[] args) {
        Cloud cloud = new Cloud("Cumulus", 2.5, true);
        System.out.println("cloud" + cloud.toString());
    }
}
