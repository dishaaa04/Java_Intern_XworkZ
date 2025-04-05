package com.xworkz.inheritanceDemo;

public class Address {

    Address() {
        System.out.println("Address initialized");
    }

    public void displayAddress() {
        System.out.println("Deliver to this address");
    }

    public void locationInfo() {
        System.out.println("This is a residential address.");
    }

    public void updateAddress() {
        System.out.println("Address updated successfully");
    }

    public void validateAddress() {
        System.out.println("Validating address details...");
    }

    public void getRegion() {
        System.out.println("Region");
    }
}
