package com.xworkz.stringrepresntation;

public class MachineLearningModelRunner {
    public static void main(String[] args) {
        MachineLearningModel ml = new MachineLearningModel("Decision Tree", "TensorFlow", 100000);
        System.out.println("ml = " + ml.toString());

        int code = ml.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("model = " + "model".hashCode());
        System.out.println("training = " + "training".hashCode());
        System.out.println("accuracy = " + "accuracy".hashCode());
    }
}
