package com.xworkz.stringrepresntation;

public class Zip {
    private String fileName;
    private double sizeMB;
    private boolean isEncrypted;

    public Zip(String fileName, double sizeMB, boolean isEncrypted) {
        this.fileName = fileName;
        this.sizeMB = sizeMB;
        this.isEncrypted = isEncrypted;
    }

    @Override
    public String toString() {
        return "[fileName=" + fileName + ", sizeMB=" + sizeMB + ", isEncrypted=" + isEncrypted + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 9100;
    }
}
