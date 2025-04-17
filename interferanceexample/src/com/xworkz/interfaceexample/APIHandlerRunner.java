package com.xworkz.interfaceexample;

public class APIHandlerRunner {
    public static void main(String[] args) {
        APIHandler api = new APIHandlerImpl();
        api.sendRequest();
        api.receiveResponse();
        api.parseJSON();
    }
}
