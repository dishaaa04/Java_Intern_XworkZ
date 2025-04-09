package com.xworkz.stringrepresntation;

public class Encryption {

    private String algorithm;
    private int keyLength;
    private boolean isSymmetric;

    public Encryption(String algorithm, int keyLength, boolean isSymmetric) {
        this.algorithm = algorithm;
        this.keyLength = keyLength;
        this.isSymmetric = isSymmetric;
    }

    @Override
    public String toString() {
        return "[algorithm=" + algorithm + ", keyLength=" + keyLength + "bit, isSymmetric=" + isSymmetric + "]";
    }
}
