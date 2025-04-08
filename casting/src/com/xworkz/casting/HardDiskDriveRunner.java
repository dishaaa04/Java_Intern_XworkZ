package com.xworkz.casting;

public class HardDiskDriveRunner {

    public static void main(String[] args) {

        HardDiskDrive hdd = new ExternalHDD();
        hdd.capacity();
        hdd.type();
        hdd.rpm();
        hdd.readWriteSpeed();

        System.out.println("----");

        ExternalHDD external = new ExternalHDD();
        external.capacity();
        external.connectUSB();
        external.type();
        external.readWriteSpeed();

        System.out.println("----");

        SmartHDD smart = new SmartHDD();
        smart.capacity();
        smart.connectUSB();
        smart.readWriteSpeed();

        System.out.println("----");

        smart.manageHDD(new ExternalHDD());
    }
}
