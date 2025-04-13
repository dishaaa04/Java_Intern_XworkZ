package com.xworkz.stringrepresntation;

public class ProcessorRunner {
    public static void main(String[] args) {
        Processor processor1 = new Processor();
        processor1.setBrand("Intel");
        processor1.setCores(8);
        processor1.setFrequency(3.5);

        Processor processor2 = new Processor();
        processor2.setBrand("Intel");
        processor2.setCores(8);
        processor2.setFrequency(3.5);

        System.out.println("Checking same location: " + (processor1 == processor2));
        boolean same = processor1.equals(processor2);
        System.out.println("processor1 is same as processor2: " + same);
    }
}
