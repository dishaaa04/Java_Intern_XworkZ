package com.xworkz.inheritanceDemo;

public class StepperMotor extends ServoMotor {

    public void stepMove() {
        System.out.println("StepperMotor moves in discrete steps");
    }

    public void setStepAngle() {
        System.out.println("StepperMotor sets step angle");
    }

    public void increasePrecision() {
        System.out.println("StepperMotor increases precision");
    }

    public void microStepping() {
        System.out.println("StepperMotor is using microstepping");
    }

    public void fullRotation() {
        System.out.println("StepperMotor completes a full rotation");
    }
}
