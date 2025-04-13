package com.xworkz.stringrepresntation;

public class LockRunner {
    public static void main(String[] args) {

        Lock lock1 = new Lock();
        lock1.setMaterial("Steel");
        lock1.setDigital(true);

        Lock lock2 = new Lock();
        lock2.setMaterial("Steel");
        lock2.setDigital(true);

        System.out.println("Checking same location: " + (lock1 == lock2));
        boolean same = lock1.equals(lock2);
        System.out.println("lock1 is same as lock2: " + same);
    }
}
