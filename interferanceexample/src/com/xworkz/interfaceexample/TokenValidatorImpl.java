package com.xworkz.interfaceexample;

public class TokenValidatorImpl implements TokenValidator {

    boolean isValid;

    @Override
    public boolean validateToken(String token) {
        if (token != null && token.length() == 10) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }

    @Override
    public void showValidationStatus() {
        if (isValid) {
            System.out.println("Token is valid.");
        } else {
            System.out.println("Token is invalid.");
        }
    }
}
