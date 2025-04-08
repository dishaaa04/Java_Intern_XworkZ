package com.xworkz.casting;

public class CPURunner {

    public static void main(String[] args) {

        CPU cpu = new IntelCPU();
        cpu.process();
        cpu.shutdown();
        cpu.architecture();
        cpu.speed();

        System.out.println("----");

        IntelCPU intel = new IntelCPU();
        intel.process();
        intel.integratedGraphics();
        intel.architecture();
        intel.shutdown();

        System.out.println("----");

        SmartIntelCPU smart = new SmartIntelCPU();
        smart.process();
        smart.integratedGraphics();
        smart.architecture();

        System.out.println("----");

        smart.manageCPU(new IntelCPU());
    }
}
