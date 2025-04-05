package com.xworkz.inheritanceDemo;

public class NetworkInterfaceCard {

    public NetworkInterfaceCard() {
        System.out.println("NetworkInterfaceCard is initialized");
    }

    public void connectToNetwork() {
        System.out.println("NIC connects device to a network");
    }

    public void sendData() {
        System.out.println("NIC sends data over the network");
    }

    public void receiveData() {
        System.out.println("NIC receives data from the network");
    }

    public void macAddress() {
        System.out.println("NIC has a unique MAC address");
    }

    public void manageSpeed() {
        System.out.println("NIC manages data transmission speed");
    }
}
