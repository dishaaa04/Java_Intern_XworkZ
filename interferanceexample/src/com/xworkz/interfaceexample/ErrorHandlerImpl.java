package com.xworkz.interfaceexample;

public class ErrorHandlerImpl implements ErrorHandler {

    String lastError;

    @Override
    public void handleError(String error) {
        lastError = error;
        System.out.println("Error handled: " + error);
    }

    @Override
    public void showLastError() {
        if(lastError != null) {
            System.out.println("Last Error: " + lastError);
        } else {
            System.out.println("No error recorded.");
        }
    }

    @Override
    public void clearError() {
        lastError = null;
        System.out.println("Error cleared.");
    }
}
