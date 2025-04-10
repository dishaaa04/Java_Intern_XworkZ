package com.xworkz.stringrepresntation;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair = new Chair("Plastic", "Dining", true);
        System.out.println("chair = " + chair.toString());

        int code = chair.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("leg = " + "leg".hashCode());
        System.out.println("backrest = " + "backrest".hashCode());
        System.out.println("armrest = " + "armrest".hashCode());
    }
}
