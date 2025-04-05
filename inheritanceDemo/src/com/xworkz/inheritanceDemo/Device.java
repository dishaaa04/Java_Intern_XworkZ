package com.xworkz.inheritanceDemo;

public class Device extends Computer {

    Device() {
        super();
        System.out.println("Laptop class");
    }

    @Override
    public void boot() {
        System.out.println("Laptop boots quickly with SSD");
    }

    @Override
    public void shutdown() {
        System.out.println("Laptop shuts down instantly");
    }

    @Override
    public void process() {
        System.out.println("Laptop processes tasks using high-speed CPU");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Laptop connects via Wi-Fi or Ethernet");
    }

    @Override
    public void storeData() {
        System.out.println("Laptop stores data on SSD or HDD");
    }

    public void batteryBackup() {
        System.out.println("Laptop has a battery backup");
    }

    public void portability() {
        System.out.println("Laptop is portable");
    }

    public void webcam() {
        System.out.println("Laptop has a webcam");
    }

    public void touchpad() {
        System.out.println("Laptop has a touchpad");
    }

    public void keyboardLight() {
        System.out.println("Laptop has a backlit keyboard");
    }
}
