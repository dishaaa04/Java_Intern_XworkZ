package com.xworkz.inheritanceDemo;

public class SolidStateDrive extends MotherBoard {

    public SolidStateDrive() {
        super();
        System.out.println("SolidStateDrive is initialized");
    }

    @Override
    public void connectComponents() {
        System.out.println("SSD connects to motherboard via SATA or NVMe");
    }

    @Override
    public void providePower() {
        System.out.println("SSD receives power from motherboard");
    }

    @Override
    public void supportCPU() {
        System.out.println("SSD does not support CPU directly");
    }

    @Override
    public void manageBIOS() {
        System.out.println("SSD can be detected and configured in BIOS");
    }

    @Override
    public void controlDataFlow() {
        System.out.println("SSD enables fast data access and flow");
    }

    public void storeData() {
        System.out.println("SSD stores OS and user data");
    }

    public void readFast() {
        System.out.println("SSD reads data at high speed");
    }

    public void writeFast() {
        System.out.println("SSD writes data at high speed");
    }

    public void noMovingParts() {
        System.out.println("SSD has no moving parts");
    }

    public void silentOperation() {
        System.out.println("SSD operates silently");
    }
}
