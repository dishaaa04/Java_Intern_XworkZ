package com.xworkz.inheritanceDemo;

public class Ticket extends Train {

    public Ticket() {
        super();
        System.out.println("Ticket system initialized");
    }

    @Override
    public void announce() {
        System.out.println("Ticket shows destination and timing");
    }

    @Override
    public void slowDown() {
        System.out.println("Ticket update: Train is slowing down");
    }

    @Override
    public void speedUp() {
        System.out.println("Ticket update: Train is speeding up");
    }

    @Override
    public void stop() {
        System.out.println("Ticket shows stop details");
    }

    @Override
    public void start() {
        System.out.println("Ticket confirms train departure");
    }

    public void bookTicket() {
        System.out.println("Booking ticket successful");
    }

    public void cancelTicket() {
        System.out.println("Ticket cancellation complete");
    }

    public void checkAvailability() {
        System.out.println("Checking seat availability");
    }

    public void getFareDetails() {
        System.out.println("Displaying fare details");
    }

    public void printTicket() {
        System.out.println("Ticket is being printed");
    }
}
