package com.xworkz.inheritanceDemo;

public class Hacker extends Spy {

    public Hacker() {
        super();
        System.out.println("Hacker is activated");
    }

    @Override
    public void gatherIntel() {
        System.out.println("Hacker is gathering data from the dark web");
    }

    @Override
    public void disguise() {
        System.out.println("Hacker is masking IP address");
    }

    @Override
    public void useGadgets() {
        System.out.println("Hacker is using a laptop and scripts");
    }

    @Override
    public void escape() {
        System.out.println("Hacker is disconnecting from the network");
    }

    @Override
    public void decodeMessage() {
        System.out.println("Hacker is decrypting a secure message");
    }

    public void hackSecurity() {
        System.out.println("Hacker is breaking through firewalls");
    }

    public void stealData() {
        System.out.println("Hacker is stealing confidential data");
    }

    public void writeVirus() {
        System.out.println("Hacker is writing a virus");
    }

    public void eraseEvidence() {
        System.out.println("Hacker is erasing digital footprints");
    }

    public void takeControl() {
        System.out.println("Hacker is taking control of the system");
    }
}
