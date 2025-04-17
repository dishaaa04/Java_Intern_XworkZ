package com.xworkz.interfaceexample;

public class CloudConnectorRunner {
    public static void main(String[] args) {
        CloudConnector connector = new CloudConnectorImpl();
        connector.uploadData("File1.txt");
        connector.connectToCloud();
        connector.uploadData("File1.txt");
        connector.disconnectFromCloud();
    }
}
