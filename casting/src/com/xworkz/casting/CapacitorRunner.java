package com.xworkz.casting;

public class CapacitorRunner {

    public static void main(String[] args) {

        Capacitor cap = new ElectrolyticCapacitor();
        cap.charge();
        cap.discharge();
        cap.type();
        cap.capacity();

        System.out.println("----");

        ElectrolyticCapacitor elec = new ElectrolyticCapacitor();
        elec.charge();
        elec.checkPolarity();
        elec.type();
        elec.discharge();

        System.out.println("----");

        SmartCapacitor smart = new SmartCapacitor();
        smart.charge();
        smart.checkPolarity();
        smart.type();

        System.out.println("----");

        smart.manageCapacitor(new ElectrolyticCapacitor());
    }
}

