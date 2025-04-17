package com.xworkz.interfaceexample;

public class FeedbackSystemRunner {
    public static void main(String[] args) {
        FeedbackSystem system = new FeedbackSystemImpl();
        system.showFeedback();
        system.submitFeedback("Great user interface!");
        system.submitFeedback("Needs more examples.");
        system.showFeedback();
        system.clearFeedback();
        system.showFeedback();
    }
}
