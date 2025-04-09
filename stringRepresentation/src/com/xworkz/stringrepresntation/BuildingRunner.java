package com.xworkz.stringrepresntation;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building = new Building("Prestige Tower", 20, "Whitefield");
        System.out.println("building" + building.toString());
    }
}
