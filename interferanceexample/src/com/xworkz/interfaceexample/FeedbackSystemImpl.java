package com.xworkz.interfaceexample;

public class FeedbackSystemImpl implements FeedbackSystem {

    String feedbacks = "";

    @Override
    public void submitFeedback(String feedback) {
        feedbacks += feedback + "\n";
        System.out.println("Feedback submitted.");
    }

    @Override
    public void showFeedback() {
        if (feedbacks.isEmpty()) {
            System.out.println("No feedback available.");
        } else {
            System.out.println("Feedbacks:\n" + feedbacks);
        }
    }

    @Override
    public void clearFeedback() {
        feedbacks = "";
        System.out.println("Feedback cleared.");
    }
}
