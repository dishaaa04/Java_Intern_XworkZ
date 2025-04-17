package com.xworkz.interfaceexample;

public class TokenValidatorRunner {
    public static void main(String[] args) {
        TokenValidator validator = new TokenValidatorImpl();
        validator.validateToken("1234567890");
        validator.showValidationStatus();
        validator.validateToken("12345");
        validator.showValidationStatus();
    }
}
