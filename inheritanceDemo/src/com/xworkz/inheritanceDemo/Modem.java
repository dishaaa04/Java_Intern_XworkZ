package com.xworkz.inheritanceDemo;

public class Modem extends Router {

    public Modem() {
        super();
        System.out.println("Modem is set up");
    }

    @Override
    public void connectDevices() {
        System.out.println("Modem connects to one device or router");
    }

    @Override
    public void assignIP() {
        System.out.println("Modem gets IP from ISP and forwards it");
    }

    @Override
    public void routeTraffic() {
        System.out.println("Modem passes traffic to the router");
    }

    @Override
    public void manageNetwork() {
        System.out.println("Modem has limited network management");
    }

    @Override
    public void firewallProtection() {
        System.out.println("Modem provides basic firewall features");
    }

    public void connectToISP() {
        System.out.println("Modem connects to the internet service provider");
    }

    public void convertSignal() {
        System.out.println("Modem converts digital signals to analog and vice versa");
    }

    public void checkDSL() {
        System.out.println("Modem checks DSL or cable line");
    }

    public void authenticateConnection() {
        System.out.println("Modem authenticates with ISP");
    }

    public void resetConnection() {
        System.out.println("Modem can reset internet connection");
    }
}
