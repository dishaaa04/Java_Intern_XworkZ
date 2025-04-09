package com.xworkz.stringrepresntation;

public class EncryptionRunner {
    public static void main(String[] args) {
        Encryption encryption = new Encryption("AES", 256, true);
        System.out.println("encryption" + encryption.toString());
    }
}
