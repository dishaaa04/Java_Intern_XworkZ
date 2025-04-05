package com.xworkz.inheritanceDemo;

public class SavingsAccount extends Bank {

    SavingsAccount() {
        super();
        System.out.println("Savings Account class");
    }

    @Override
    public void openAccount() {
        System.out.println("Savings account opened with initial deposit");
    }

    @Override
    public void depositMoney() {
        System.out.println("Depositing money into savings account");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Withdrawing from savings account");
    }

    @Override
    public void provideLoan() {
        System.out.println("Savings account holders get limited loan options");
    }

    @Override
    public void generateStatement() {
        System.out.println("Monthly savings account statement generated");
    }

    public void earnInterest() {
        System.out.println("Savings account earns interest");
    }

    public void maintainMinimumBalance() {
        System.out.println("Savings account requires minimum balance");
    }

    public void withdrawLimit() {
        System.out.println("Savings account has a withdrawal limit");
    }

    public void onlineBanking() {
        System.out.println("Savings account supports online banking");
    }

    public void issueDebitCard() {
        System.out.println("Savings account provides a debit card");
    }
}
