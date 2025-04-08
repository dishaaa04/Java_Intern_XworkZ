package com.xworkz.casting;

public class SmartCapacitor extends ElectrolyticCapacitor {

    @Override
    public void charge() {
        System.out.println("Smart capacitor is charging with monitoring system.");
    }

    public void manageCapacitor(Capacitor cap) {
        System.out.println("Managing capacitor...");

        cap.charge();
        cap.capacity();

        if (cap instanceof ElectrolyticCapacitor) {
            System.out.println("It's an Electrolytic Capacitor.");
            ElectrolyticCapacitor elec = (ElectrolyticCapacitor) cap;
            elec.checkPolarity();
            elec.type();
        }
    }
}

