package com.xworkz.stringrepresntation;

public class TentRunner {
    public static void main(String[] args) {
        Tent tent1 = new Tent();
        tent1.setColor("Green");
        tent1.setCapacity(4);
        tent1.setWaterproof(true);

        Tent tent2 = new Tent();
        tent2.setColor("Green");
        tent2.setCapacity(4);
        tent2.setWaterproof(true);

        System.out.println("Checking same location: " + (tent1 == tent2));
        boolean same = tent1.equals(tent2);
        System.out.println("tent1 is same as tent2: " + same);
    }
}
