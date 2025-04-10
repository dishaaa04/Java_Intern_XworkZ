package com.xworkz.stringrepresntation;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI", "Bangalore", 850);
        String bankString = bank.toString();
        System.out.println("bank = " + bankString);

        int code = bank.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        String value = "account";
        System.out.println("account = " + value.hashCode());

        String value2 = "balance";
        System.out.println("balance = " + value2.hashCode());

        String value3 = "loan";
        System.out.println("loan = " + value3.hashCode());
    }
}
