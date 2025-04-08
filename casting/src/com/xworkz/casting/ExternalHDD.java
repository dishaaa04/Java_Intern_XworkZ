package com.xworkz.casting;

public class ExternalHDD extends HardDiskDrive {

    @Override
    public void type() {
        System.out.println("Type: External HDD");
    }

    @Override
    public void readWriteSpeed() {
        System.out.println("Read/Write Speed: 100MB/s via USB 3.0");
    }

    public void connectUSB() {
        System.out.println("Connected via USB cable");
    }
}

