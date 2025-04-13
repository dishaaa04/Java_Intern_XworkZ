package com.xworkz.stringrepresntation;

public class Encryption {
    private String algorithm;
    private int keyLength;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public int getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(int keyLength) {
        this.keyLength = keyLength;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Encryption) {
            Encryption other = (Encryption) obj;
            return this.algorithm.equals(other.algorithm) && this.keyLength == other.keyLength;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Encryption{algorithm='" + algorithm + "', keyLength=" + keyLength + "}";
    }

    @Override
    public int hashCode() {
        return algorithm.hashCode() + keyLength;
    }
}
