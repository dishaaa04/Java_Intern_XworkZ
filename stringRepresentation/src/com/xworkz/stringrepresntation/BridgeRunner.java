package com.xworkz.stringrepresntation;

public class BridgeRunner {
    public static void main(String[] args) {
        Bridge bridge = new Bridge("Golden Gate", "Steel", 2737);
        System.out.println("bridge = " + bridge.toString());

        int code = bridge.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("river = " + "river".hashCode());
        System.out.println("support = " + "support".hashCode());
        System.out.println("beam = " + "beam".hashCode());
    }
}
