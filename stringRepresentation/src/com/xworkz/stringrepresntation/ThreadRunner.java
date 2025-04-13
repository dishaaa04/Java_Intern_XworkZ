package com.xworkz.stringrepresntation;

public class ThreadRunner {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        thread1.setMaterial("Cotton");
        thread1.setColor("Red");
        thread1.setThickness(0.5);

        Thread thread2 = new Thread();
        thread2.setMaterial("Cotton");
        thread2.setColor("Red");
        thread2.setThickness(0.5);

        System.out.println("Checking same location: " + (thread1 == thread2));
        boolean same = thread1.equals(thread2);
        System.out.println("thread1 is same as thread2: " + same);
    }
}
