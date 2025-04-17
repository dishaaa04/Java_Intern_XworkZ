package com.xworkz.interfaceexample;

public class AuthenticationServiceImpl implements AuthenticationService {

    public void login() {
        System.out.println("User logged in");
    }

    public void logout() {
        System.out.println("User logged out");
    }

    public void resetPassword() {
        System.out.println("Password reset successfully");
    }
}
