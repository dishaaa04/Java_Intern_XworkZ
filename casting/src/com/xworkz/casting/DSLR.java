package com.xworkz.casting;

public class DSLR extends Camera {

    @Override
    public void turnOn() {
        System.out.println("DSLR is powering on with lens check.");
    }

    @Override
    public void turnOff() {
        System.out.println("DSLR is shutting down safely.");
    }

    public void changeLens() {
        System.out.println("Changing DSLR lens.");
    }

    @Override
    public void resolution() {
        System.out.println("Resolution: 24 MP.");
    }
}
