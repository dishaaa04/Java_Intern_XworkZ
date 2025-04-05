package com.xworkz.inheritanceDemo;

public class ROM {

    public ROM() {
        System.out.println("ROM is initialized");
    }

    public void storeData() {
        System.out.println("ROM stores firmware permanently");
    }

    public void readData() {
        System.out.println("ROM allows only read access");
    }

    public void bootSystem() {
        System.out.println("ROM helps in booting the system");
    }

    public void nonVolatile() {
        System.out.println("ROM retains data without power");
    }

    public void fixedContent() {
        System.out.println("ROM content is written once and rarely changed");
    }
}
