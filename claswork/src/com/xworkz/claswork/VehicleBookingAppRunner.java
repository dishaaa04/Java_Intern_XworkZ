package com.xworkz.claswork;

public class VehicleBookingAppRunner {
    public static void commute(VehicleBookingApp vehicle){
        vehicle.bookRide();
    }

        public static void main(String[] args){
            commute(new Auto());
            commute(new Bike());
            commute(new Car());
        }
    }


