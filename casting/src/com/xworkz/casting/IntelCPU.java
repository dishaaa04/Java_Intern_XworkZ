package com.xworkz.casting;

public class IntelCPU extends CPU {

    @Override
    public void process() {
        System.out.println("Intel CPU is processing with Hyper-Threading.");
    }

    @Override
    public void shutdown() {
        System.out.println("Intel CPU is entering low-power mode.");
    }

    public void integratedGraphics() {
        System.out.println("Intel CPU includes integrated Intel UHD graphics.");
    }

    @Override
    public void architecture() {
        System.out.println("Architecture: x86 Intel.");
    }
}
