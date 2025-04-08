package com.xworkz.casting;

public class BluetoothModuleRunner {

    public static void main(String[] args) {

        BluetoothModule module = new HC05Module();
        module.powerOn();
        module.powerOff();
        module.version();
        module.dataRate();

        System.out.println("----");

        HC05Module hc05 = new HC05Module();
        hc05.powerOn();
        hc05.configureATMode();
        hc05.version();
        hc05.powerOff();

        System.out.println("----");

        SmartHC05Module smart = new SmartHC05Module();
        smart.powerOn();
        smart.configureATMode();
        smart.version();

        System.out.println("----");

        smart.manageModule(new HC05Module());
    }
}

