package com.xworkz.inheritanceDemo;

public class Bank {

    Bank() {
        System.out.println("Bank class");
    }

    public void openAccount() {
        System.out.println("Bank opens an account");
    }

    public void depositMoney() {
        System.out.println("Bank accepts deposits");
    }

    public void withdrawMoney() {
        System.out.println("Bank allows withdrawals");
    }

    public void provideLoan() {
        System.out.println("Bank provides loans");
    }

    public void generateStatement() {
        System.out.println("Bank generates account statements");
    }
}
