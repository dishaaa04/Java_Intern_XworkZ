package com.xworkz.stringrepresntation;

public class TapRunner {
    public static void main(String[] args) {
        Tap tap = new Tap("Chrome", "Wall-mounted", false);
        System.out.println("tap" + tap.toString());
    }
}
