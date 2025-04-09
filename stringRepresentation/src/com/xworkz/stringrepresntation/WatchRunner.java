package com.xworkz.stringrepresntation;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch("Fastrack", true, 1499.99);
        System.out.println("watch" + watch.toString());
    }
}
