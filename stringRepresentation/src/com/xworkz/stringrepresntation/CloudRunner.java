package com.xworkz.stringrepresntation;

public class CloudRunner {
    public static void main(String[] args) {
        Cloud cloud = new Cloud("Cumulus", 2.5, true);
        System.out.println("cloud = " + cloud.toString());

        int code = cloud.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("rain = " + "rain".hashCode());
        System.out.println("fog = " + "fog".hashCode());
        System.out.println("sky = " + "sky".hashCode());
    }
}
