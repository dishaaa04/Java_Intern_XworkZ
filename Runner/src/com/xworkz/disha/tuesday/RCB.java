package com.xworkz.disha.tuesday;

class RCB {
    void celebrate(Trophy trophy) {
        if (trophy != null) {
            System.out.println("RCB is celebrating...");
            trophy.displayTrophy();
        } else {
            System.out.println("Still waiting for the trophy...");
        }
    }
}
