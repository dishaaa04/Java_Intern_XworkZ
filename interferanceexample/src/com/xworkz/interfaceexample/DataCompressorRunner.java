package com.xworkz.interfaceexample;

public class DataCompressorRunner {
    public static void main(String[] args) {
        DataCompressor compressor = new DataCompressorImpl();
        compressor.showCompressedData();
        compressor.compress("HelloWorld");
        compressor.showCompressedData();
        compressor.decompress();
    }
}
