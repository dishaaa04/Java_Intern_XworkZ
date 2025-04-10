package com.xworkz.stringrepresntation;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote = new Remote("TV", 12, true);
        System.out.println("remote = " + remote.toString());

        int code = remote.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("switch = " + "switch".hashCode());
        System.out.println("volume = " + "volume".hashCode());
        System.out.println("channel = " + "channel".hashCode());
    }
}
