package com.xworkz.stringrepresntation;

public class Encryption {
    private String type;
    private int keyLength;
    private boolean isSymmetric;

    public Encryption(String type, int keyLength, boolean isSymmetric) {
        this.type = type;
        this.keyLength = keyLength;
        this.isSymmetric = isSymmetric;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", keyLength=" + keyLength + ", isSymmetric=" + isSymmetric + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 1600;
    }
}
