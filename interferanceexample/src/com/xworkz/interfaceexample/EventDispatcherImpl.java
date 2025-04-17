package com.xworkz.interfaceexample;

public class EventDispatcherImpl implements EventDispatcher {

    Runnable listener;

    @Override
    public void registerListener(Runnable listener) {
        this.listener = listener;
        System.out.println("Listener registered.");
    }

    @Override
    public void dispatchEvent() {
        if (listener != null) {
            listener.run();
        } else {
            System.out.println("No listener to dispatch to.");
        }
    }

    @Override
    public void clearListener() {
        listener = null;
        System.out.println("Listener cleared.");
    }
}
