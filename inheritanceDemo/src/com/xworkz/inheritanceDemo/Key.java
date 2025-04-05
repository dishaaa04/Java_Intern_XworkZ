package com.xworkz.inheritanceDemo;

public class Key extends Lock {

    public Key() {
        super();
        System.out.println("Key is created");
    }

    @Override
    public void secure() {
        System.out.println("Key helps in locking securely");
    }

    @Override
    public void open() {
        System.out.println("Key is used to open the lock");
    }

    @Override
    public void close() {
        System.out.println("Key is used to close the lock");
    }

    @Override
    public void rust() {
        System.out.println("Key is made of stainless steel, doesn’t rust easily");
    }

    @Override
    public void breakLock() {
        System.out.println("Key can be used to break into lock if forced");
    }

    public void insert() {
        System.out.println("Key is inserted into the lock");
    }

    public void rotate() {
        System.out.println("Key is rotated to open the lock");
    }

    public void duplicate() {
        System.out.println("Key can be duplicated");
    }

    public void lost() {
        System.out.println("Key is lost");
    }

    public void matchLock() {
        System.out.println("Key matches a specific lock");
    }
}
