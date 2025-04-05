package com.xworkz.inheritanceDemo;

public class Kitten extends Cat {

    Kitten() {
        super();
        System.out.println("HackerCat has entered the system!");
    }

    @Override
    public void meow() {
        System.out.println("Kitten lets out a tiny but fierce meow");
    }

    @Override
    public void sleep() {
        System.out.println("Kitten sleeps while plotting digital chaos");
    }

    @Override
    public void eat() {
        System.out.println("Kitten eats bytes and fish");
    }

    @Override
    public void play() {
        System.out.println("Kitten plays with code and yarn simultaneously");
    }

    @Override
    public void scratchFurniture() {
        System.out.println("Kitten scratches your gaming chair");
    }

    public void hackWiFi() {
        System.out.println("HackerCat has cracked the neighbor's WiFi password");
    }

    public void stealPasswords() {
        System.out.println("HackerCat is stealing passwords while you sleep");
    }

    public void writeCode() {
        System.out.println("HackerCat is coding a virus");
    }

    public void bypassFirewall() {
        System.out.println("HackerCat just bypassed a firewall");
    }

    public void deleteInternet() {
        System.out.println("HackerCat has accidentally deleted the entire internet!");
    }
}
