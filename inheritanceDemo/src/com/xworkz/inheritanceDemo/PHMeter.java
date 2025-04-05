package com.xworkz.inheritanceDemo;

public class PHMeter extends UltrasonicSensor {

    @Override
    public void measureDistance() {
        System.out.println("PHMeter measures the distance using ultrasonic waves with high precision");
    }

    @Override
    public void detectObjects() {
        System.out.println("PHMeter detects objects related to pH testing with ultrasonic technology");
    }

    @Override
    public void calibrateSensor() {
        System.out.println("PHMeter calibrates for accurate pH and distance measurements");
    }

    @Override
    public void displayReading() {
        System.out.println("PHMeter displays pH level along with distance reading");
    }

    public void measurePH() {
        System.out.println("PHMeter measures the pH level of a solution");
    }

    public void calibratePHMeter() {
        System.out.println("PHMeter calibrates for accurate pH measurements");
    }

    public void displayPH() {
        System.out.println("PHMeter displays the current pH level");
    }
}
