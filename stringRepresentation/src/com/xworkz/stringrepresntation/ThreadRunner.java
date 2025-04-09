package com.xworkz.stringrepresntation;

public class ThreadRunner {
    public static void main(String[] args) {
        Thread thread = new Thread("White", "Cotton", 50.0);
        System.out.println("thread" + thread.toString());
    }
}
