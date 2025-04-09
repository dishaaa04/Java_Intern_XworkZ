package com.xworkz.stringrepresntation;

public class LockRunner {
    public static void main(String[] args) {
        Lock lock = new Lock("Padlock", "Godrej", false);
        System.out.println("lock" + lock.toString());
    }
}
