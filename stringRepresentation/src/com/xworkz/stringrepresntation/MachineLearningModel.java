package com.xworkz.stringrepresntation;

public class MachineLearningModel {
    private String algorithm;
    private double accuracy;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof MachineLearningModel) {
            MachineLearningModel other = (MachineLearningModel) obj;
            return this.algorithm.equals(other.algorithm) && this.accuracy == other.accuracy;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MachineLearningModel{algorithm='" + algorithm + "', accuracy=" + accuracy + "}";
    }

    @Override
    public int hashCode() {
        return algorithm.hashCode() + Double.hashCode(accuracy);
    }
}
