package com.xworkz.interfaceexample;

public class DataProcessorRunner {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessorImpl();
        processor.showProcessedData();
        processor.processData("Raw Input Data");
        processor.showProcessedData();
        processor.clearData();
        processor.showProcessedData();
    }
}
