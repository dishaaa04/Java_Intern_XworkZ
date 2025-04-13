package com.xworkz.stringrepresntation;

public class MobileRunner {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();
        mobile1.setBrand("Samsung");
        mobile1.setStorage(128);

        Mobile mobile2 = new Mobile();
        mobile2.setBrand("Samsung");
        mobile2.setStorage(128);

        System.out.println("Checking same location: " + (mobile1 == mobile2));
        boolean same = mobile1.equals(mobile2);
        System.out.println("mobile1 is same as mobile2: " + same);
    }
}
