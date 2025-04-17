package com.xworkz.interfaceexample;

public class DataLoggerImpl implements DataLogger {

    String logs = "";

    @Override
    public void logData(String data) {
        logs += data + "\n";
        System.out.println("Data logged.");
    }

    @Override
    public void showLogs() {
        if (logs.isEmpty()) {
            System.out.println("No logs to show.");
        } else {
            System.out.println("Logs:\n" + logs);
        }
    }

    @Override
    public void clearLogs() {
        logs = "";
        System.out.println("Logs cleared.");
    }
}
