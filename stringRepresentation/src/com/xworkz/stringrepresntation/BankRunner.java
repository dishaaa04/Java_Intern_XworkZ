package com.xworkz.stringrepresntation;

public class BankRunner {
    public static void main(String[] args) {

        Bank bank1 = new Bank();
        bank1.setBankName("SBI");

        Bank bank2 = new Bank();
        bank2.setBankName("SBI");

        System.out.println("Checking same location: " + (bank1 == bank2));
        System.out.println("bank1 is same as bank2: " + bank1.equals(bank2));
    }
}
