package com.xworkz.com.hybridinheritanceexampletype;

public class HybridInheritanceRunner {
    public static void main(String[] args) {

        System.out.println("=== Example 1: Laptop ===");
        Laptop laptop = new Laptop();
        laptop.start();
        laptop.compute();
        laptop.fold();

        System.out.println("\n=== Example 2: MusicPlayer and VideoPlayer ===");
        MusicPlayer music = new MusicPlayer();
        music.play();
        music.volumeUp();
        music.shuffle();

        VideoPlayer video = new VideoPlayer();
        video.play();
        video.brightnessUp();

        System.out.println("\n=== Example 3: Microwave and Refrigerator ===");
        Microwave microwave = new Microwave();
        microwave.powerOn();
        microwave.plugIn();
        microwave.heatFood();

        Refrigerator fridge = new Refrigerator();
        fridge.powerOn();
        fridge.cool();

        System.out.println("\n=== Example 4: BackendDeveloper and FrontendDeveloper ===");
        BackendDeveloper backend = new BackendDeveloper();
        backend.work();
        backend.writeCode();
        backend.buildAPI();

        FrontendDeveloper frontend = new FrontendDeveloper();
        frontend.work();
        frontend.writeCode();
        frontend.designUI();

        System.out.println("\n=== Example 5: AWS and Azure ===");
        AWS aws = new AWS();
        aws.startService();
        aws.deploy();
        aws.launchEC2();

        Azure azure = new Azure();
        azure.startService();
        azure.manageVM();

        System.out.println("\n=== Example 6: GPU and CPU ===");
        GPU gpu = new GPU();
        gpu.identify();
        gpu.install();
        gpu.renderGraphics();

        CPU cpu = new CPU();
        cpu.identify();
        cpu.processData();

        System.out.println("\n=== Example 7: MySQL and PostgreSQL ===");
        MySQL mysql = new MySQL();
        mysql.connect();
        mysql.executeQuery();
        mysql.useStorageEngine();

        PostgreSQL postgres = new PostgreSQL();
        postgres.connect();
        postgres.enableExtensions();

        System.out.println("\n=== Example 8: Spring and Django ===");
        Spring spring = new Spring();
        spring.setup();
        spring.handleRouting();
        spring.injectDependencies();

        Django django = new Django();
        django.setup();
        django.serveTemplate();
    }
}
