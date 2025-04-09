package com.xworkz.stringrepresntation;

public class KettleRunner {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Prestige", 1.8, true);
        System.out.println("kettle" + kettle.toString());
    }
}
