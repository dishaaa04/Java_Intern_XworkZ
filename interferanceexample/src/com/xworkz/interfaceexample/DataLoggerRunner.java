package com.xworkz.interfaceexample;

public class DataLoggerRunner {
    public static void main(String[] args) {
        DataLogger logger = new DataLoggerImpl();
        logger.showLogs();
        logger.logData("App started");
        logger.logData("User clicked button");
        logger.showLogs();
        logger.clearLogs();
        logger.showLogs();
    }
}
