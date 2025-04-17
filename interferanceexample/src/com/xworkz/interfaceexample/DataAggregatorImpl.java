package com.xworkz.interfaceexample;

public class DataAggregatorImpl implements DataAggregator {

    int total = 0;

    @Override
    public void addData(int data) {
        total += data;
        System.out.println("Added data: " + data);
    }

    @Override
    public void showTotal() {
        System.out.println("Total data: " + total);
    }

    @Override
    public void resetData() {
        total = 0;
        System.out.println("Data reset.");
    }
}
