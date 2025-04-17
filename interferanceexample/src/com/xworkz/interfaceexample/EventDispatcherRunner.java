package com.xworkz.interfaceexample;

public class EventDispatcherRunner {
    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcherImpl();
        dispatcher.dispatchEvent();
        dispatcher.registerListener(() -> System.out.println("Event received and handled."));
        dispatcher.dispatchEvent();
        dispatcher.clearListener();
        dispatcher.dispatchEvent();
    }
}
