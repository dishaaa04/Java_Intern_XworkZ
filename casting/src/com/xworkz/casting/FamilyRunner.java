package com.xworkz.casting;

public class FamilyRunner {

    public static void main(String[] args) {

        Family family = new JointFamily();
        family.members();
        family.homeType();
        family.tradition();
        family.incomeSource();

        System.out.println("----");

        JointFamily joint = new JointFamily();
        joint.members();
        joint.celebrateFestival();
        joint.homeType();
        joint.incomeSource();

        System.out.println("----");

        SmartFamily smart = new SmartFamily();
        smart.members();
        smart.celebrateFestival();
        smart.homeType();

        System.out.println("----");

        smart.manageFamily(new JointFamily());
    }
}
