package com.xworkz.stringrepresntation;

public class LockRunner {
    public static void main(String[] args) {
        Lock lock = new Lock("Padlock", "Godrej", false);
        System.out.println("lock = " + lock.toString());

        int code = lock.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("key = " + "key".hashCode());
        System.out.println("bolt = " + "bolt".hashCode());
        System.out.println("security = " + "security".hashCode());
    }
}
