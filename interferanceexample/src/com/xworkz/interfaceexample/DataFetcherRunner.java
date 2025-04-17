package com.xworkz.interfaceexample;

public class DataFetcherRunner {
    public static void main(String[] args) {
        DataFetcher fetcher = new DataFetcherImpl();
        fetcher.displayData();
        fetcher.fetchData();
        fetcher.displayData();
        fetcher.clearData();
        fetcher.displayData();
    }
}
