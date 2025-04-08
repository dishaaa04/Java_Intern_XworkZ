package com.xworkz.casting;

public class CameraRunner {

    public static void main(String[] args) {

        Camera camera = new DSLR();
        camera.turnOn();
        camera.turnOff();
        camera.resolution();
        camera.storageType();

        System.out.println("----");

        DSLR dslr = new DSLR();
        dslr.turnOn();
        dslr.changeLens();
        dslr.resolution();
        dslr.turnOff();

        System.out.println("----");

        SmartDSLR smart = new SmartDSLR();
        smart.turnOn();
        smart.changeLens();
        smart.resolution();

        System.out.println("----");

        smart.manageCamera(new DSLR());
    }
}

