package com.xworkz.inheritanceDemo;

public class MathTeacher extends Teacher {

    public MathTeacher() {
        super();
        System.out.println("Math Teacher is ready to teach math");
    }

    @Override
    public void teach() {
        System.out.println("Math Teacher is explaining math concepts");
    }

    @Override
    public void giveAssignment() {
        System.out.println("Math Teacher gives math problems as assignments");
    }

    @Override
    public void takeAttendance() {
        System.out.println("Math Teacher marks attendance on the math sheet");
    }

    @Override
    public void evaluatePapers() {
        System.out.println("Math Teacher evaluates math test papers");
    }

    @Override
    public void provideFeedback() {
        System.out.println("Math Teacher provides feedback on math performance");
    }

    public void solveEquations() {
        System.out.println("Math Teacher is solving equations");
    }

    public void teachAlgebra() {
        System.out.println("Math Teacher is teaching algebra");
    }

    public void conductMathQuiz() {
        System.out.println("Math Teacher is conducting a math quiz");
    }

    public void explainGeometry() {
        System.out.println("Math Teacher is explaining geometry");
    }

    public void checkHomework() {
        System.out.println("Math Teacher is checking homework");
    }
}
