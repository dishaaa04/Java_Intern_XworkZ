package com.xworkz.inheritanceDemo;

public class Arduino {

    public void powerOn() {
        System.out.println("Arduino is powered on");
    }

    public void uploadCode() {
        System.out.println("Arduino code is uploaded via USB");
    }

    public void executeProgram() {
        System.out.println("Arduino executes the program using microcontroller");
    }

    public void readSensorData() {
        System.out.println("Arduino reads sensor data via analog/digital pins");
    }

    public void controlActuators() {
        System.out.println("Arduino controls actuators based on logic");
    }
}
