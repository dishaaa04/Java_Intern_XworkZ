package com.xworkz.interfaceexample;

public class FileEncryptorImpl implements FileEncryptor {

    String encryptedContent;

    @Override
    public void encryptFile(String filename) {
        encryptedContent = "ENC(" + filename + ")";
        System.out.println("File encrypted.");
    }

    @Override
    public void decryptFile() {
        if (encryptedContent != null) {
            String original = encryptedContent.replace("ENC(", "").replace(")", "");
            System.out.println("Decrypted content: " + original);
            encryptedContent = null;
        } else {
            System.out.println("No file to decrypt.");
        }
    }

    @Override
    public void showEncryptedContent() {
        if (encryptedContent != null) {
            System.out.println("Encrypted Content: " + encryptedContent);
        } else {
            System.out.println("No encrypted content.");
        }
    }
}
