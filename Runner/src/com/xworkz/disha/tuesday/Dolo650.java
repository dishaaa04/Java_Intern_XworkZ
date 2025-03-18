package com.xworkz.disha.tuesday;

class Dolo650 {
    void takeMedicine(Fever fever) {
        if (fever != null) {
            System.out.println("Taking Dolo 650...");
            fever.cure();
        } else {
            System.out.println("No fever, no need for medicine!");
        }
    }
}

