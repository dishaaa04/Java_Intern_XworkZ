package com.xworkz.casting;

public class NationalBank extends Bank {

    @Override
    public void deposit() {
        System.out.println("Depositing in a nationalized bank.");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing from a nationalized bank.");
    }

    public void provideLoan() {
        System.out.println("Providing government-backed loans.");
    }

    @Override
    public void type() {
        System.out.println("National Bank.");
    }
}
