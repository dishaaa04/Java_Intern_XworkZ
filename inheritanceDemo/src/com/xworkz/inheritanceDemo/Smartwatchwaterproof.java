package com.xworkz.inheritanceDemo;

public class Smartwatchwaterproof extends RaspberryPiCamera {

    @Override
    public void initializeCamera() {
        System.out.println("Smartwatch camera system is initialized for quick access");
    }

    @Override
    public void captureImage() {
        System.out.println("Smartwatch captures a quick selfie or photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Smartwatch records short video clips");
    }

    @Override
    public void adjustFocus() {
        System.out.println("Smartwatch adjusts focus for wrist-level shots");
    }

    @Override
    public void streamFeed() {
        System.out.println("Smartwatch streams camera feed to connected smartphone");
    }

    public void trackHeartRate() {
        System.out.println("Smartwatch tracks heart rate in real-time");
    }

    public void showNotifications() {
        System.out.println("Smartwatch displays call and message notifications");
    }

    public void countSteps() {
        System.out.println("Smartwatch counts daily steps and tracks activity");
    }

    public void setAlarm() {
        System.out.println("Smartwatch sets and vibrates alarms");
    }
}
