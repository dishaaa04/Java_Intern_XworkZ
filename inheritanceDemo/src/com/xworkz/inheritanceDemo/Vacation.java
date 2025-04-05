package com.xworkz.inheritanceDemo;

public class Vacation extends Resort {

    public Vacation() {
        System.out.println("Vacation has started");
    }

    @Override
    public void bookRoom() {
        System.out.println("Booking a resort room for vacation");
    }

    public void relax() {
        System.out.println("Relaxing during vacation");
    }

    public void trip() {
        System.out.println("Going on a trip during vacation");
    }

    public void holiday() {
        System.out.println("Enjoying the holiday");
    }

    public void tourists() {
        System.out.println("Meeting other tourists");
    }

    public void activities() {
        System.out.println("Participating in vacation activities");
    }
}
