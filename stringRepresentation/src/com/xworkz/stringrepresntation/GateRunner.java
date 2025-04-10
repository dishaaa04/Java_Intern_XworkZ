package com.xworkz.stringrepresntation;

public class GateRunner {
    public static void main(String[] args) {
        Gate gate = new Gate("Iron", 7.5, false);
        System.out.println("gate = " + gate.toString());

        int code = gate.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("lock = " + "lock".hashCode());
        System.out.println("hinge = " + "hinge".hashCode());
        System.out.println("sensor = " + "sensor".hashCode());
    }
}
