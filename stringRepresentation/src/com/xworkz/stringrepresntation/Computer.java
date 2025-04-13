package com.xworkz.stringrepresntation;

public class Computer {
    private String processor;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Computer) {
                Computer other = (Computer) obj;
                return this.processor.equals(other.processor);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Computer{processor='" + processor + "'}";
    }

    @Override
    public int hashCode() {
        return processor.hashCode();
    }
}
