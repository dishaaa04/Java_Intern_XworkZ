package com.xworkz.stringrepresntation;

public class YogaMatRunner {
    public static void main(String[] args) {
        YogaMat mat = new YogaMat("Purple", 5.0, true);
        System.out.println("yogaMat = " + mat.toString());

        int code = mat.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("asana = " + "asana".hashCode());
        System.out.println("stretch = " + "stretch".hashCode());
        System.out.println("pose = " + "pose".hashCode());
    }
}
