package com.xworkz.casting;

public class DigitalNationalBank extends NationalBank {

    @Override
    public void deposit() {
        System.out.println("Depositing through digital platform.");
    }

    public void manageBank(Bank bank) {
        System.out.println("Managing bank operations...");

        bank.deposit();
        bank.interestRate();

        if (bank instanceof NationalBank) {
            System.out.println("It is a National Bank.");
            NationalBank nb = (NationalBank) bank;
            nb.provideLoan();
            nb.type();
        }
    }
}
