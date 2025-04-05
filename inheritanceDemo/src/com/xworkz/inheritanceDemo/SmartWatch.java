package com.xworkz.inheritanceDemo;

public class SmartWatch extends SmartDevice {

    public SmartWatch() {
        super();
        System.out.println("SmartWatch is initializing");
    }

    @Override
    public void powerOn() {
        System.out.println("SmartWatch is turning on");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("SmartWatch connecting to WiFi");
    }

    @Override
    public void updateSoftware() {
        System.out.println("SmartWatch installing updates");
    }

    @Override
    public void showBatteryStatus() {
        System.out.println("SmartWatch battery is at 75%");
    }

    @Override
    public void powerOff() {
        System.out.println("SmartWatch is shutting down");
    }

    public void trackSteps() {
        System.out.println("SmartWatch is tracking steps");
    }

    public void measureHeartRate() {
        System.out.println("SmartWatch measuring heart rate");
    }

    public void displayNotifications() {
        System.out.println("SmartWatch displaying notifications");
    }

    public void setAlarm() {
        System.out.println("SmartWatch setting an alarm");
    }

    public void trackSleep() {
        System.out.println("SmartWatch is tracking sleep");
    }
}
