package com.xworkz.casting;

public class SmartGPU extends GamingGPU {

    @Override
    public void brand() {
        System.out.println("Brand: AI-Optimized NVIDIA SmartGPU");
    }

    public void manageGPU(GPU gpu) {
        System.out.println("Analyzing GPU specs...");

        gpu.brand();
        gpu.performance();

        if (gpu instanceof GamingGPU) {
            System.out.println("It's a GamingGPU.");
            GamingGPU gaming = (GamingGPU) gpu;
            gaming.rayTracingSupport();
            gaming.coolingType();
        }
    }
}
