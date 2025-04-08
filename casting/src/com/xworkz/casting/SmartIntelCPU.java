package com.xworkz.casting;

public class SmartIntelCPU extends IntelCPU {

    @Override
    public void process() {
        System.out.println("Smart Intel CPU is dynamically boosting performance.");
    }

    public void manageCPU(CPU cpu) {
        System.out.println("Managing CPU...");

        cpu.process();
        cpu.speed();

        if (cpu instanceof IntelCPU) {
            System.out.println("It's an Intel CPU.");
            IntelCPU intel = (IntelCPU) cpu;
            intel.integratedGraphics();
            intel.architecture();
        }
    }
}
