package com.xworkz.stringrepresntation;

public class TVRunner {
    public static void main(String[] args) {
        TV tv = new TV("Sony", 65, "4K UHD");
        System.out.println("tv" + tv.toString());
    }
}
