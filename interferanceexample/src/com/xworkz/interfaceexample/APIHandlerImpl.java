package com.xworkz.interfaceexample;

public class APIHandlerImpl implements APIHandler {

    public void sendRequest() {
        System.out.println("Request sent to API");
    }

    public void receiveResponse() {
        System.out.println("Response received from API");
    }

    public void parseJSON() {
        System.out.println("JSON parsed from response");
    }
}
