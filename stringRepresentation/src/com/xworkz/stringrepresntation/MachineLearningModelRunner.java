package com.xworkz.stringrepresntation;

public class MachineLearningModelRunner {
    public static void main(String[] args) {

        MachineLearningModel model1 = new MachineLearningModel();
        model1.setAlgorithm("Random Forest");
        model1.setAccuracy(92.5);

        MachineLearningModel model2 = new MachineLearningModel();
        model2.setAlgorithm("Random Forest");
        model2.setAccuracy(92.5);

        System.out.println("Checking same location: " + (model1 == model2));
        boolean same = model1.equals(model2);
        System.out.println("model1 is same as model2: " + same);
    }
}
