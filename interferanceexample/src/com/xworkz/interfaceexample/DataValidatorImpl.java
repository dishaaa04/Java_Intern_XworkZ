package com.xworkz.interfaceexample;

public class DataValidatorImpl implements DataValidator {

    boolean isValid;

    @Override
    public boolean validateData(String data) {
        if (data != null && !data.isEmpty()) {
            isValid = true;
            System.out.println("Data is valid.");
        } else {
            isValid = false;
            System.out.println("Data is invalid.");
        }
        return isValid;
    }

    @Override
    public void showValidationStatus() {
        if (isValid) {
            System.out.println("Validation Status: Valid");
        } else {
            System.out.println("Validation Status: Invalid");
        }
    }
}
