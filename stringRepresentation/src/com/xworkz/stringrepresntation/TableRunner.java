package com.xworkz.stringrepresntation;

public class TableRunner {
    public static void main(String[] args) {
        Table table = new Table("Rectangle", "Wood", 4);
        System.out.println("table = " + table.toString());

        int code = table.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("desk = " + "desk".hashCode());
        System.out.println("workspace = " + "workspace".hashCode());
        System.out.println("study = " + "study".hashCode());
    }
}
