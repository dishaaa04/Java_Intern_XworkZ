package com.xworkz.inheritanceDemo;

public class PinCode extends Address {

    PinCode() {
        System.out.println("PinCode initialized");
    }

    public void getAreaCode() {
        System.out.println("Area code is 560001");
    }

    public void checkDeliveryAvailability() {
        System.out.println("Delivery is available in this area.");
    }

    public void displayPincode() {
        System.out.println("The pincode is 560001");
    }

    public void validatePincode() {
        System.out.println("Pincode is valid.");
    }

    @Override
    public void updateAddress() {
        System.out.println("Address updated with new pincode details.");
    }
}
