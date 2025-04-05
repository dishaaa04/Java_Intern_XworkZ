package com.xworkz.inheritanceDemo;

public class Switch extends NetworkInterfaceCard {

    public Switch() {
        super();
        System.out.println("Switch is initialized");
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Switch connects multiple devices to a network");
    }

    @Override
    public void sendData() {
        System.out.println("Switch sends data to the correct destination");
    }

    @Override
    public void receiveData() {
        System.out.println("Switch receives data from connected devices");
    }

    @Override
    public void macAddress() {
        System.out.println("Switch uses MAC addresses to forward data");
    }

    @Override
    public void manageSpeed() {
        System.out.println("Switch manages network traffic efficiently");
    }

    public void increasePorts() {
        System.out.println("Switch offers multiple Ethernet ports");
    }

    public void reduceCollisions() {
        System.out.println("Switch reduces network collisions");
    }

    public void manageBandwidth() {
        System.out.println("Switch manages bandwidth distribution");
    }

    public void filterTraffic() {
        System.out.println("Switch filters incoming and outgoing traffic");
    }

    public void layerTwoDevice() {
        System.out.println("Switch operates at Layer 2 of OSI model");
    }
}
