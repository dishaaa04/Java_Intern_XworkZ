package com.xworkz.disha.tuesday;

class Pillow {
    void use(Sleep sleep) {
        if (sleep != null) {
            System.out.println("Using a soft pillow...");
            sleep.relax();
        } else {
            System.out.println("No sleep without a pillow.");
        }
    }
}
