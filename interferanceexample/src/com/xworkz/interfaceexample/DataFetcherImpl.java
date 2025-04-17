package com.xworkz.interfaceexample;

public class DataFetcherImpl implements DataFetcher {

    String data;

    @Override
    public void fetchData() {
        data = "Sample fetched data";
        System.out.println("Data fetched.");
    }

    @Override
    public void displayData() {
        if (data != null) {
            System.out.println("Fetched Data: " + data);
        } else {
            System.out.println("No data available.");
        }
    }

    @Override
    public void clearData() {
        data = null;
        System.out.println("Data cleared.");
    }
}
