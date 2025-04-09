package com.xworkz.stringrepresntation;

public class XRayRunner {
    public static void main(String[] args) {
        XRay xray = new XRay("Chest", "PA View", true);
        System.out.println("xray" + xray.toString());
    }
}
