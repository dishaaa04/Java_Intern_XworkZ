package com.xworkz.casting;

public class JointFamily extends Family {

    @Override
    public void members() {
        System.out.println("Joint family has 12 members.");
    }

    @Override
    public void homeType() {
        System.out.println("Home Type: Independent house");
    }

    public void celebrateFestival() {
        System.out.println("Joint family celebrates festivals together.");
    }

    @Override
    public void incomeSource() {
        System.out.println("Income Source: Multiple sources including jobs and business.");
    }
}
