package com.xworkz.interfaceexample;

public interface ErrorHandler {
    void handleError(String error);
    void showLastError();
    void clearError();
}
