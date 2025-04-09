package com.xworkz.stringrepresntation;

public class MachineLearningModel {

    private String modelName;
    private String algorithm;
    private double accuracy;

    public MachineLearningModel(String modelName, String algorithm, double accuracy) {
        this.modelName = modelName;
        this.algorithm = algorithm;
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "[modelName=" + modelName + ", algorithm=" + algorithm + ", accuracy=" + accuracy + "]";
    }
}
