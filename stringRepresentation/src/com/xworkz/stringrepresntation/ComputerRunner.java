package com.xworkz.stringrepresntation;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", 16, "Intel i7");
        System.out.println("computer" + computer.toString());
    }
}
