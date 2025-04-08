package com.xworkz.casting;

public class SmartHDD extends ExternalHDD {

    @Override
    public void capacity() {
        System.out.println("Capacity: 2TB with cloud sync");
    }

    public void manageHDD(HardDiskDrive hdd) {
        System.out.println("Managing HDD...");

        hdd.capacity();
        hdd.type();

        if (hdd instanceof ExternalHDD) {
            System.out.println("It's an ExternalHDD.");
            ExternalHDD ext = (ExternalHDD) hdd;
            ext.connectUSB();
            ext.readWriteSpeed();
        }
    }
}
