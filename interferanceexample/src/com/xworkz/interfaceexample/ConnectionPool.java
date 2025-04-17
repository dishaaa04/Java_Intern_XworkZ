package com.xworkz.interfaceexample;

public interface ConnectionPool {
    void createConnection();
    void releaseConnection();
    void showStatus();
}
