package com.xworkz.inheritancesingletype;

public class RunnerSingleInheritance {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.compileCode();

        IDE ide = new IDE();
        ide.run();
        ide.debug();

        TemperatureSensor tempSensor = new TemperatureSensor();
        tempSensor.read();
        tempSensor.displayTemperature();

        Car car = new Car();
        car.move();
        car.accelerate();

        ARMProcessor arm = new ARMProcessor();
        arm.process();
        arm.efficiency();

        WebServer server = new WebServer();
        server.start();
        server.handleRequest();

        JavaCompiler compiler = new JavaCompiler();
        compiler.compile();
        compiler.optimize();

        SSD ssd = new SSD();
        ssd.writeData();
        ssd.readSpeed();

        Wifi wifi = new Wifi();
        wifi.connect();
        wifi.encrypt();

        LithiumBattery battery = new LithiumBattery();
        battery.charge();
        battery.capacity();

        MobileApp app = new MobileApp();
        app.launch();
        app.update();
    }
}
