package com.xworkz.stringrepresntation;

public class MachineLearningModelRunner {
    public static void main(String[] args) {
        MachineLearningModel model = new MachineLearningModel("ChurnPredictor", "RandomForest", 0.91);
        System.out.println("machineLearningModel" + model.toString());
    }
}
