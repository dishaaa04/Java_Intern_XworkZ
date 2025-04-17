package com.xworkz.interfaceexample;

public class FileEncryptorRunner {
    public static void main(String[] args) {
        FileEncryptor encryptor = new FileEncryptorImpl();
        encryptor.showEncryptedContent();
        encryptor.encryptFile("document.txt");
        encryptor.showEncryptedContent();
        encryptor.decryptFile();
        encryptor.showEncryptedContent();
    }
}
