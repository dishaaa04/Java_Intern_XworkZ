package com.xworkz.inheritanceDemo;

public class SmartLED extends LED {

    public SmartLED() {
        super();
        System.out.println("SmartLED is initialized");
    }

    @Override
    public void emitLight() {
        System.out.println("SmartLED emits light with adjustable brightness and color");
    }

    @Override
    public void saveEnergy() {
        System.out.println("SmartLED optimizes energy usage based on settings");
    }

    @Override
    public void longLasting() {
        System.out.println("SmartLED lasts longer with smart operation");
    }

    @Override
    public void ecoFriendly() {
        System.out.println("SmartLED enhances eco-friendliness with sensors");
    }

    @Override
    public void noHeat() {
        System.out.println("SmartLED maintains minimal heat even on high brightness");
    }

    public void connectToWiFi() {
        System.out.println("SmartLED connects to WiFi");
    }

    public void controlWithApp() {
        System.out.println("SmartLED can be controlled via mobile app");
    }

    public void changeColors() {
        System.out.println("SmartLED changes colors");
    }

    public void scheduleLighting() {
        System.out.println("SmartLED follows a lighting schedule");
    }

    public void voiceControl() {
        System.out.println("SmartLED supports voice control");
    }
}
