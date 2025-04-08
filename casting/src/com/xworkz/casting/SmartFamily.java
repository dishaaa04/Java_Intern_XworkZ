package com.xworkz.casting;

public class SmartFamily extends JointFamily {

    @Override
    public void members() {
        System.out.println("Smart family is digitally connected with 10+ members.");
    }

    public void manageFamily(Family family) {
        System.out.println("Managing family info...");

        family.members();
        family.tradition();

        if (family instanceof JointFamily) {
            System.out.println("It's a JointFamily.");
            JointFamily joint = (JointFamily) family;
            joint.celebrateFestival();
            joint.incomeSource();
        }
    }
}
