package com.xworkz.interfaceexample;

public class ErrorHandlerRunner {
    public static void main(String[] args) {
        ErrorHandler handler = new ErrorHandlerImpl();
        handler.showLastError();
        handler.handleError("Null Pointer Exception");
        handler.showLastError();
        handler.clearError();
        handler.showLastError();
    }
}
