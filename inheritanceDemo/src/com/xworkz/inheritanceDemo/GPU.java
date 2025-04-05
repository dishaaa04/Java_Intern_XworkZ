package com.xworkz.inheritanceDemo;

public class GPU extends ROM {

    public GPU() {
        super();
        System.out.println("GPU is initialized");
    }

    @Override
    public void storeData() {
        System.out.println("GPU stores texture and frame data");
    }

    @Override
    public void readData() {
        System.out.println("GPU reads and processes graphical data");
    }

    @Override
    public void bootSystem() {
        System.out.println("GPU is not involved in system booting");
    }

    @Override
    public void nonVolatile() {
        System.out.println("GPU memory may be volatile or non-volatile");
    }

    @Override
    public void fixedContent() {
        System.out.println("GPU memory content changes frequently during operations");
    }

    public void renderGraphics() {
        System.out.println("GPU renders images and videos");
    }

    public void process3DModels() {
        System.out.println("GPU processes complex 3D models");
    }

    public void supportGaming() {
        System.out.println("GPU supports high-end gaming");
    }

    public void handleParallelTasks() {
        System.out.println("GPU handles multiple parallel computing tasks");
    }

    public void enhancePerformance() {
        System.out.println("GPU enhances overall system performance in graphics-heavy applications");
    }
}
