package com.xworkz.stringrepresntation;

public class ProcessorRunner {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", 8, 3.6);
        System.out.println("processor = " + processor.toString());

        int code = processor.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("cpu = " + "cpu".hashCode());
        System.out.println("cache = " + "cache".hashCode());
        System.out.println("logic = " + "logic".hashCode());
    }
}
