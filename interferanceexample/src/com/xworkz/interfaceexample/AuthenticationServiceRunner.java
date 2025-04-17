package com.xworkz.interfaceexample;

public class AuthenticationServiceRunner {
    public static void main(String[] args) {
        AuthenticationService auth = new AuthenticationServiceImpl();
        auth.login();
        auth.logout();
        auth.resetPassword();
    }
}
