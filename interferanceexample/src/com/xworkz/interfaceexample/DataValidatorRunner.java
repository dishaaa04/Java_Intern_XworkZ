package com.xworkz.interfaceexample;

public class DataValidatorRunner {
    public static void main(String[] args) {
        DataValidator validator = new DataValidatorImpl();
        validator.validateData("Valid data");
        validator.showValidationStatus();
        validator.validateData("");
        validator.showValidationStatus();
    }
}
