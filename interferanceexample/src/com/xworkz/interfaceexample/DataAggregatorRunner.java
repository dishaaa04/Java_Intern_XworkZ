package com.xworkz.interfaceexample;

public class DataAggregatorRunner {
    public static void main(String[] args) {
        DataAggregator aggregator = new DataAggregatorImpl();
        aggregator.showTotal();
        aggregator.addData(10);
        aggregator.addData(20);
        aggregator.showTotal();
        aggregator.resetData();
        aggregator.showTotal();
    }
}
