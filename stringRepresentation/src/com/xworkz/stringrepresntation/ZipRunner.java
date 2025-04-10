package com.xworkz.stringrepresntation;

public class ZipRunner {
    public static void main(String[] args) {
        Zip zip = new Zip("backup.zip", 15.3, true);
        System.out.println("zip = " + zip.toString());

        int code = zip.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("compress = " + "compress".hashCode());
        System.out.println("archive = " + "archive".hashCode());
        System.out.println("extract = " + "extract".hashCode());
    }
}
