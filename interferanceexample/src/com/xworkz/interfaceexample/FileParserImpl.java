package com.xworkz.interfaceexample;

public class FileParserImpl implements FileParser {

    String parsedData;

    @Override
    public void parseFile(String filename) {
        parsedData = "Parsed content of: " + filename;
        System.out.println("File parsed.");
    }

    @Override
    public void showParsedData() {
        if (parsedData != null) {
            System.out.println("Parsed Data: " + parsedData);
        } else {
            System.out.println("No data to show.");
        }
    }

    @Override
    public void clearData() {
        parsedData = null;
        System.out.println("Parsed data cleared.");
    }
}
