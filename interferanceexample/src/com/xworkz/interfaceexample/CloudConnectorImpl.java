package com.xworkz.interfaceexample;

public class CloudConnectorImpl implements CloudConnector {

    String cloudStatus = "Disconnected";

    @Override
    public void connectToCloud() {
        cloudStatus = "Connected";
        System.out.println("Connected to cloud.");
    }

    @Override
    public void uploadData(String data) {
        if (cloudStatus.equals("Connected")) {
            System.out.println("Uploaded data: " + data);
        } else {
            System.out.println("Cannot upload. Not connected to cloud.");
        }
    }

    @Override
    public void disconnectFromCloud() {
        cloudStatus = "Disconnected";
        System.out.println("Disconnected from cloud.");
    }
}
