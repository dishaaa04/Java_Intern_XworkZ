package com.xworkz.stringrepresntation;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC", "Indiranagar", 6.5);
        System.out.println("bank" + bank.toString());
    }
}
