package com.xworkz.inheritanceDemo;

public class Psychology extends Economics {

    @Override
    public void studySupplyDemand() {
        System.out.println("Psychology studies how mental processes affect decisions");
    }

    @Override
    public void learnMicroeconomics() {
        System.out.println("Psychology focuses on individual behavior over economic models");
    }

    @Override
    public void exploreMacroeconomics() {
        System.out.println("Psychology explores societal mental health, not economic systems");
    }

    @Override
    public void analyzeMarkets() {
        System.out.println("Psychology studies consumer behavior in markets");
    }

    @Override
    public void understandPolicies() {
        System.out.println("Psychology helps design policies considering human behavior");
    }

    public void studyCognition() {
        System.out.println("Studying how people think, learn, and remember");
    }

    public void exploreBehavior() {
        System.out.println("Exploring patterns in human and animal behavior");
    }

    public void understandEmotions() {
        System.out.println("Understanding emotional responses and their effects");
    }

    public void researchMentalHealth() {
        System.out.println("Researching mental health issues and treatments");
    }
}
