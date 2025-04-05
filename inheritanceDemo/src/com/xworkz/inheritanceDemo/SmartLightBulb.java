package com.xworkz.inheritanceDemo;

public class SmartLightBulb extends ThreeDPrinter {

    @Override
    public void initializePrinter() {
        System.out.println("Smart Light Bulb is initialized and connected to the app");
    }

    @Override
    public void loadMaterial() {
        System.out.println("Smart Light Bulb loads energy-efficient lighting material");
    }

    @Override
    public void startPrinting() {
        System.out.println("Smart Light Bulb turns on and starts functioning");
    }

    @Override
    public void stopPrinting() {
        System.out.println("Smart Light Bulb turns off");
    }

    @Override
    public void displayProgress() {
        System.out.println("Smart Light Bulb displays current brightness and color settings");
    }

    public void changeColor() {
        System.out.println("Smart Light Bulb changes color");
    }

    public void adjustBrightness() {
        System.out.println("Smart Light Bulb adjusts brightness level");
    }

    public void setTimer() {
        System.out.println("Smart Light Bulb sets timer for automatic turn-off");
    }

    public void controlViaApp() {
        System.out.println("Smart Light Bulb is controlled via a smartphone app");
    }
}
