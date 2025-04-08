package com.xworkz.casting;

public class GPURunner {

    public static void main(String[] args) {

        GPU gpu = new GamingGPU();
        gpu.brand();
        gpu.memory();
        gpu.performance();
        gpu.coolingType();

        System.out.println("----");

        GamingGPU gaming = new GamingGPU();
        gaming.brand();
        gaming.rayTracingSupport();
        gaming.memory();
        gaming.coolingType();

        System.out.println("----");

        SmartGPU smart = new SmartGPU();
        smart.brand();
        smart.rayTracingSupport();
        smart.coolingType();

        System.out.println("----");

        smart.manageGPU(new GamingGPU());
    }
}
