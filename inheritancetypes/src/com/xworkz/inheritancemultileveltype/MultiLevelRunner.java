package com.xworkz.inheritancemultileveltype;
public class MultiLevelRunner {
    public static void main(String[] args) {

        // 1. Machine → Computer → Laptop
        Laptop laptop = new Laptop();
        laptop.start();
        laptop.boot();
        laptop.runCode();

        System.out.println();

        // 2. Code → Compiler → JavaCompiler
        JavaCompiler javaCompiler = new JavaCompiler();
        javaCompiler.write();
        javaCompiler.compile();
        javaCompiler.optimize();

        System.out.println();

        // 3. Connection → Protocol → HttpProtocol
        HttpProtocol http = new HttpProtocol();
        http.open();
        http.setRules();
        http.sendRequest();

        System.out.println();

        // 4. Data → Storage → CloudStorage
        CloudStorage cloud = new CloudStorage();
        cloud.create();
        cloud.save();
        cloud.sync();

        System.out.println();

        // 5. Signal → Modulator → Demodulator
        Demodulator modem = new Demodulator();
        modem.transmit();
        modem.modulate();
        modem.demodulate();

        System.out.println();

        // 6. Media → Audio → Podcast
        Podcast podcast = new Podcast();
        podcast.play();
        podcast.adjustVolume();
        podcast.stream();

        System.out.println();

        // 7. Device → Mobile → Smartphone
        Smartphone phone = new Smartphone();
        phone.powerOn();
        phone.call();
        phone.browse();

        System.out.println();

        // 8. Account → BankAccount → SavingsAccount
        SavingsAccount savings = new SavingsAccount();
        savings.create();
        savings.deposit();
        savings.earnInterest();

        System.out.println();

        // 9. Component → UIComponent → Button
        Button button = new Button();
        button.render();
        button.addToUI();
        button.click();

        System.out.println();

        // 10. Language → ProgrammingLanguage → Java
        Java javaLang = new Java();
        javaLang.defineGrammar();
        javaLang.compile();
        javaLang.runJVM();

        System.out.println();

        // 11. Sensor → DigitalSensor → MotionSensor
        MotionSensor motionSensor = new MotionSensor();
        motionSensor.detect();
        motionSensor.calibrate();
        motionSensor.triggerAlarm();

        System.out.println("\nAll Multi-Level Inheritance examples executed.");
    }
}

