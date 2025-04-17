package com.xworkz.interfaceexample;

public interface TokenValidator {
    boolean validateToken(String token);
    void showValidationStatus();
}
