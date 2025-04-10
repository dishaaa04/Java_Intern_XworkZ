package com.xworkz.stringrepresntation;

public class XeroxMachineRunner {
    public static void main(String[] args) {
        XeroxMachine machine = new XeroxMachine("Canon", true, 300);
        System.out.println("xeroxMachine = " + machine.toString());

        int code = machine.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("copy = " + "copy".hashCode());
        System.out.println("paper = " + "paper".hashCode());
        System.out.println("ink = " + "ink".hashCode());
    }
}
