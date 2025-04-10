package com.xworkz.stringrepresntation;

public class EncryptionRunner {
    public static void main(String[] args) {
        Encryption encryption = new Encryption("AES", 256, true);
        System.out.println("encryption = " + encryption.toString());

        int code = encryption.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("rsa = " + "rsa".hashCode());
        System.out.println("sha256 = " + "sha256".hashCode());
        System.out.println("ssl = " + "ssl".hashCode());
    }
}
