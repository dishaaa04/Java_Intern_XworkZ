
package com.xworkz.stringrepresntation;
public class BridgeRunner {
    public static void main(String[] args) {

        Bridge bridge1 = new Bridge();
        bridge1.setType("Suspension");

        Bridge bridge2 = new Bridge();
        bridge2.setType("Suspension");

        System.out.println("Checking same location: " + (bridge1 == bridge2));

        boolean same = bridge1.equals(bridge2);
        System.out.println("bridge1 is same as bridge2: " + same);
    }
}
