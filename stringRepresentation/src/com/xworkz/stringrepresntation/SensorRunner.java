package com.xworkz.stringrepresntation;

public class SensorRunner {
    public static void main(String[] args) {
        Sensor sensor = new Sensor("Temperature", "Celsius", 150.0);
        System.out.println("sensor" + sensor.toString());
    }
}
