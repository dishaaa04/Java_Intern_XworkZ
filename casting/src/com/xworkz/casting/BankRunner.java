package com.xworkz.casting;

public class BankRunner {

    public static void main(String[] args) {

        Bank bank = new NationalBank();
        bank.deposit();
        bank.withdraw();
        bank.type();
        bank.interestRate();

        System.out.println("----");

        NationalBank national = new NationalBank();
        national.deposit();
        national.provideLoan();
        national.type();
        national.withdraw();

        System.out.println("----");

        DigitalNationalBank digital = new DigitalNationalBank();
        digital.deposit();
        digital.provideLoan();
        digital.type();

        System.out.println("----");

        digital.manageBank(new NationalBank());
    }
}
