package com.xworkz.stringrepresntation;

public class Bank {

    private String name;
    private String branch;
    private double interestRate;

    public Bank(String name, String branch, double interestRate) {
        this.name = name;
        this.branch = branch;
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", branch=" + branch + ", interestRate=" + interestRate + "]";
    }
}
