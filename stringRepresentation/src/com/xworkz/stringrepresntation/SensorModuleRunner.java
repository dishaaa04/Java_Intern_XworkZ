package com.xworkz.stringrepresntation;

public class SensorModuleRunner {
    public static void main(String[] args) {
        SensorModule sensorModule1 = new SensorModule();
        sensorModule1.setModel("SM-100");
        sensorModule1.setNumberOfSensors(5);
        sensorModule1.setWireless(true);

        SensorModule sensorModule2 = new SensorModule();
        sensorModule2.setModel("SM-100");
        sensorModule2.setNumberOfSensors(5);
        sensorModule2.setWireless(true);

        System.out.println("Checking same location: " + (sensorModule1 == sensorModule2));
        boolean same = sensorModule1.equals(sensorModule2);
        System.out.println("sensorModule1 is same as sensorModule2: " + same);
    }
}
