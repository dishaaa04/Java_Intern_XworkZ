package com.xworkz.interfaceexample;

public class ConnectionPoolImpl implements ConnectionPool {

    boolean isConnected = false;

    @Override
    public void createConnection() {
        isConnected = true;
        System.out.println("Connection created.");
    }

    @Override
    public void releaseConnection() {
        isConnected = false;
        System.out.println("Connection released.");
    }

    @Override
    public void showStatus() {
        if (isConnected) {
            System.out.println("Status: Connected");
        } else {
            System.out.println("Status: Not Connected");
        }
    }
}
