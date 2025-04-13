package com.xworkz.stringrepresntation;

public class SensorRunner {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor();
        sensor1.setType("Temperature");
        sensor1.setRange(100.5);
        sensor1.setActive(true);

        Sensor sensor2 = new Sensor();
        sensor2.setType("Temperature");
        sensor2.setRange(100.5);
        sensor2.setActive(true);

        System.out.println("Checking same location: " + (sensor1 == sensor2));
        boolean same = sensor1.equals(sensor2);
        System.out.println("sensor1 is same as sensor2: " + same);
    }
}
