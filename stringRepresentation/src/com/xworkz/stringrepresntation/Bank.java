package com.xworkz.stringrepresntation;

public class Bank {
    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bank) {
            Bank other = (Bank) obj;
            return this.bankName.equals(other.bankName);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bank{bankName='" + bankName + "'}";
    }

    @Override
    public int hashCode() {
        return bankName.hashCode();
    }
}
