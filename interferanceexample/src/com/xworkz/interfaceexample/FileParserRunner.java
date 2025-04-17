package com.xworkz.interfaceexample;

public class FileParserRunner {
    public static void main(String[] args) {
        FileParser parser = new FileParserImpl();
        parser.showParsedData();
        parser.parseFile("data.csv");
        parser.showParsedData();
        parser.clearData();
        parser.showParsedData();
    }
}
