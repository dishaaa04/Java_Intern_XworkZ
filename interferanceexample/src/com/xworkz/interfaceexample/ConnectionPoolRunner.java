package com.xworkz.interfaceexample;

public class ConnectionPoolRunner {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPoolImpl();
        pool.showStatus();
        pool.createConnection();
        pool.showStatus();
        pool.releaseConnection();
        pool.showStatus();
    }
}
