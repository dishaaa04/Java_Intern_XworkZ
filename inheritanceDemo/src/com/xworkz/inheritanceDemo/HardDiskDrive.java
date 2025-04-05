package com.xworkz.inheritanceDemo;

public class HardDiskDrive extends CPU {

    public HardDiskDrive() {
        super();
        System.out.println("HardDiskDrive is initialized");
    }

    @Override
    public void processInstructions() {
        System.out.println("HDD does not process instructions");
    }

    @Override
    public void executeProgram() {
        System.out.println("HDD does not execute programs directly");
    }

    @Override
    public void controlOperations() {
        System.out.println("HDD is controlled by the CPU");
    }

    @Override
    public void fetchData() {
        System.out.println("HDD provides data storage and retrieval");
    }

    @Override
    public void decodeInstructions() {
        System.out.println("HDD does not decode instructions");
    }

    public void storeFiles() {
        System.out.println("HDD stores large files");
    }

    public void readDisk() {
        System.out.println("HDD reads data from the disk");
    }

    public void writeDisk() {
        System.out.println("HDD writes data to the disk");
    }

    public void spinPlatters() {
        System.out.println("HDD spins magnetic platters");
    }

    public void managePartitions() {
        System.out.println("HDD manages partitions and sectors");
    }
}
