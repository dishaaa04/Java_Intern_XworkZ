package com.xworkz.casting;

public class GamingGPU extends GPU {

    @Override
    public void brand() {
        System.out.println("Brand: NVIDIA GeForce RTX");
    }

    @Override
    public void memory() {
        System.out.println("Memory: 12GB GDDR6X");
    }

    public void rayTracingSupport() {
        System.out.println("Feature: Supports real-time ray tracing");
    }

    @Override
    public void coolingType() {
        System.out.println("Cooling Type: Dual-fan with heatsink");
    }
}
