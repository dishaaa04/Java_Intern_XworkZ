package com.xworkz.stringrepresntation;

public class SensorRunner {
    public static void main(String[] args) {
        Sensor sensor = new Sensor("Temperature", "Celsius", 100);
        System.out.println("sensor = " + sensor.toString());

        int code = sensor.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("detect = " + "detect".hashCode());
        System.out.println("measure = " + "measure".hashCode());
        System.out.println("sense = " + "sense".hashCode());
    }
}
