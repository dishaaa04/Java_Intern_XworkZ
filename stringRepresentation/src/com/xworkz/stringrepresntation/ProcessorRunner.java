package com.xworkz.stringrepresntation;

public class ProcessorRunner {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7", 8, 3.6);
        System.out.println("processor" + processor.toString());
    }
}
