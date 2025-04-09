package com.xworkz.stringrepresntation;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote = new Remote("TV", 2, true);
        System.out.println("remote" + remote.toString());
    }
}
