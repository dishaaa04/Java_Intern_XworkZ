package com.xworkz.casting;

public class SmartDSLR extends DSLR {

    @Override
    public void turnOn() {
        System.out.println("Smart DSLR auto-starts with face detection.");
    }

    public void manageCamera(Camera camera) {
        System.out.println("Managing camera...");

        camera.turnOn();
        camera.storageType();

        if (camera instanceof DSLR) {
            System.out.println("It's a DSLR.");
            DSLR dslr = (DSLR) camera;
            dslr.changeLens();
            dslr.resolution();
        }
    }
}
