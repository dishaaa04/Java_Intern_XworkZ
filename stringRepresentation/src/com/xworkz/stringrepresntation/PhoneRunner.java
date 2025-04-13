package com.xworkz.stringrepresntation;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setModel("iPhone 15");
        phone1.setPrice(90000);

        Phone phone2 = new Phone();
        phone2.setModel("iPhone 15");
        phone2.setPrice(90000);

        System.out.println("Checking same location: " + (phone1 == phone2));
        boolean same = phone1.equals(phone2);
        System.out.println("phone1 is same as phone2: " + same);
    }
}
