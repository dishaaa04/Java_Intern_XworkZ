package com.xworkz.inheritanceDemo;

public class VRHeadset extends Drone {

    @Override
    public void startEngine() {
        System.out.println("VR Headset system starts initializing");
    }

    @Override
    public void fly() {
        System.out.println("VR Headset simulates flying experience");
    }

    @Override
    public void capturePhotos() {
        System.out.println("VR Headset captures screenshots in virtual environment");
    }

    @Override
    public void streamVideo() {
        System.out.println("VR Headset streams 360-degree video content");
    }

    @Override
    public void land() {
        System.out.println("VR Headset ends the simulation and returns to menu");
    }

    public void trackHeadMovement() {
        System.out.println("VR Headset tracks head movement for immersive control");
    }

    public void adjustLenses() {
        System.out.println("VR Headset adjusts lenses for visual clarity");
    }

    public void connectToPC() {
        System.out.println("VR Headset connects to PC or gaming console");
    }

    public void launchVRApp() {
        System.out.println("VR Headset launches a virtual reality application");
    }
}
