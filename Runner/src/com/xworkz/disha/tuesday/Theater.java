package com.xworkz.disha.tuesday;

class Theater {
    void show(Poster poster) {
        if (poster != null) {
            System.out.println("Displaying the poster in the theater...");
            poster.showInfo();
        } else {
            System.out.println("No poster available!");
        }
    }
}


