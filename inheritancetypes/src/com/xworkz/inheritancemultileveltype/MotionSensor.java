package com.xworkz.inheritancemultileveltype;

class MotionSensor extends DigitalSensor {
    void triggerAlarm() {
        System.out.println("Motion detected! Triggering alarm.");
    }
}