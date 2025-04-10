package com.xworkz.stringrepresntation;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet = new Wallet("Black", true, 499.0);
        System.out.println("wallet = " + wallet.toString());

        int code = wallet.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("cash = " + "cash".hashCode());
        System.out.println("leather = " + "leather".hashCode());
        System.out.println("money = " + "money".hashCode());
    }
}
