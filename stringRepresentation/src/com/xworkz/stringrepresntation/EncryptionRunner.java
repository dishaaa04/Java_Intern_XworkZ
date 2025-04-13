package com.xworkz.stringrepresntation;

public class EncryptionRunner {
    public static void main(String[] args) {

        Encryption encryption1 = new Encryption();
        encryption1.setAlgorithm("AES");
        encryption1.setKeyLength(256);

        Encryption encryption2 = new Encryption();
        encryption2.setAlgorithm("AES");
        encryption2.setKeyLength(256);

        System.out.println("Checking same location: " + (encryption1 == encryption2));
        boolean same = encryption1.equals(encryption2);
        System.out.println("encryption1 is same as encryption2: " + same);
    }
}
