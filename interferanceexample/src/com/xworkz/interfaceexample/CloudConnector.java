package com.xworkz.interfaceexample;

public interface CloudConnector {
    void connectToCloud();
    void uploadData(String data);
    void disconnectFromCloud();
}
