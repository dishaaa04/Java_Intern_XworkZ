package com.xworkz.stringrepresntation;

public class BridgeRunner {
    public static void main(String[] args) {
        Bridge bridge = new Bridge("Golden Gate", "Suspension", 2737);
        System.out.println("bridge" + bridge.toString());
    }
}
