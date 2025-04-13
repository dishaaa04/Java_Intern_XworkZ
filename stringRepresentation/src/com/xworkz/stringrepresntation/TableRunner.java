package com.xworkz.stringrepresntation;

public class TableRunner {
    public static void main(String[] args) {
        Table table1 = new Table();
        table1.setMaterial("Wood");
        table1.setLegs(4);
        table1.setShape("Rectangle");

        Table table2 = new Table();
        table2.setMaterial("Wood");
        table2.setLegs(4);
        table2.setShape("Rectangle");

        System.out.println("Checking same location: " + (table1 == table2));
        boolean same = table1.equals(table2);
        System.out.println("table1 is same as table2: " + same);
    }
}
