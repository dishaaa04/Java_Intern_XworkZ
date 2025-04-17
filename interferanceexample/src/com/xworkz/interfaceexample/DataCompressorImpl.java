package com.xworkz.interfaceexample;

public class DataCompressorImpl implements DataCompressor {

    String compressedData;

    @Override
    public void compress(String data) {
        compressedData = "cmp(" + data + ")";
        System.out.println("Data compressed.");
    }

    @Override
    public void decompress() {
        if (compressedData != null) {
            String original = compressedData.replace("cmp(", "").replace(")", "");
            System.out.println("Decompressed data: " + original);
        } else {
            System.out.println("No data to decompress.");
        }
    }

    @Override
    public void showCompressedData() {
        System.out.println("Compressed: " + compressedData);
    }
}
