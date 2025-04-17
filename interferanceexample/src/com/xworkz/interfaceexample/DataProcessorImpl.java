package com.xworkz.interfaceexample;

public class DataProcessorImpl implements DataProcessor {

    String processedData;

    @Override
    public void processData(String data) {
        processedData = "Processed: " + data;
        System.out.println("Data processed.");
    }

    @Override
    public void showProcessedData() {
        if (processedData != null) {
            System.out.println("Processed Data: " + processedData);
        } else {
            System.out.println("No data processed yet.");
        }
    }

    @Override
    public void clearData() {
        processedData = null;
        System.out.println("Processed data cleared.");
    }
}
