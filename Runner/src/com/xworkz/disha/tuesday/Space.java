package com.xworkz.disha.tuesday;

class Space {
    void sendMission(Astronaut astronaut) {
        if (astronaut != null) {
            System.out.println("Mission launched!");
            astronaut.explore();
        } else {
            System.out.println("No astronaut for the mission!");
        }
    }
}
