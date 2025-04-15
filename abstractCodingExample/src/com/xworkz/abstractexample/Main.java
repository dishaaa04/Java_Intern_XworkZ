package com.xworkz.abstractexample;

public class Main {
    public static void main(String[] args) {
        Extend1 e1 = new Extend1();
        e1.display();

        Extend2 e2 = new Extend2();
        e2.greet();

        Extend3 e3 = new Extend3();
        e3.show();
        e3.info();

        Extend4 e4 = new Extend4(10, 20, 30);
        e4.displayValues();

        Extend5 e5a = new Extend5(1);
        Extend5 e5b = new Extend5(1, 2);
        Extend5 e5c = new Extend5(1, 2, 3);

        e5a.printData();
        e5b.printData();
        e5c.printData();
    }
}

