package com.xworkz.stringrepresntation;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        w1.setColor("Brown");

        Wallet w2 = new Wallet();
        w2.setColor("Brown");

        System.out.println("Checking same location: " + (w1 == w2));
        boolean same = w1.equals(w2);
        System.out.println("w1 is same as w2: " + same);
    }
}
