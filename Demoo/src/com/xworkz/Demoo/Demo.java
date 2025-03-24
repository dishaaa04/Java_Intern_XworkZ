package com.xworkz.Demoo;

class Demo {

    public int publicVar = 10;
    int packageVar = 20;
    private final int privateVar = 30;



    public void publicMethod() {
        System.out.println("Public method: " + publicVar);
    }

    void packageMethod() {
        System.out.println("Package-level method: " + packageVar);
    }

    private void privateMethod() {
        System.out.println("Private method: " + privateVar);
    }


    public void accessPrivateMethod() {
        privateMethod();
    }
}
