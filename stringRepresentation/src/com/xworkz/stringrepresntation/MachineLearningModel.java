package com.xworkz.stringrepresntation;

public class MachineLearningModel {
    private String algorithm;
    private String framework;
    private int datasetSize;

    public MachineLearningModel(String algorithm, String framework, int datasetSize) {
        this.algorithm = algorithm;
        this.framework = framework;
        this.datasetSize = datasetSize;
    }

    @Override
    public String toString() {
        return "[algorithm=" + algorithm + ", framework=" + framework + ", datasetSize=" + datasetSize + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 3100;
    }
}
