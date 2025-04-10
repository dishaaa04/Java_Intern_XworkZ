package com.xworkz.stringrepresntation;

public class IronRunner {
    public static void main(String[] args) {
        Iron iron = new Iron("Philips", 1200, true);
        System.out.println("iron = " + iron.toString());

        int code = iron.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("plate = " + "plate".hashCode());
        System.out.println("steam = " + "steam".hashCode());
        System.out.println("cord = " + "cord".hashCode());
    }
}
