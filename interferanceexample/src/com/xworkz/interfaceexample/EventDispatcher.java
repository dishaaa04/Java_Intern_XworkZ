package com.xworkz.interfaceexample;

public interface EventDispatcher {
    void registerListener(Runnable listener);
    void dispatchEvent();
    void clearListener();
}
