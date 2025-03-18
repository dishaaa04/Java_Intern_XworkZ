package com.xworkz.disha.tuesday;

class Barber {
    void cut(Haircut haircut) {
        if (haircut != null) {
            System.out.println("Barber is starting the haircut...");
            haircut.style();
        } else {
            System.out.println("No customer for a haircut.");
        }
    }
}

