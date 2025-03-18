package com.xworkz.disha.tuesday;


    class Shop {
        void ads(Display display) {
            if (display != null) {
                System.out.println("Running ads in the shop...");
                display.run();
            } else {
                System.out.println("No display available!, NullPointerException!");
            }
        }
    }
