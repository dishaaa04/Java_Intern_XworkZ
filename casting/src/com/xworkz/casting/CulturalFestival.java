package com.xworkz.casting;

public class CulturalFestival extends Festival {

    @Override
    public void name() {
        System.out.println("Festival: Navaratri");
    }

    @Override
    public void month() {
        System.out.println("Month: October");
    }

    public void traditionalEvents() {
        System.out.println("Traditional Events: Garba, Dandiya, Cultural shows");
    }

    @Override
    public void location() {
        System.out.println("Location: Community Center");
    }
}
