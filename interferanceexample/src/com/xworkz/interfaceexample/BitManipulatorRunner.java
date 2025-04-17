package com.xworkz.interfaceexample;

public class BitManipulatorRunner {
    public static void main(String[] args) {
        BitManipulator bit = new BitManipulatorImpl();
        bit.setBit();
        bit.clearBit();
        bit.toggleBit();
    }
}
