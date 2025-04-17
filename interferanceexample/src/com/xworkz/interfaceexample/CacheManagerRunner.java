package com.xworkz.interfaceexample;

public class CacheManagerRunner {
    public static void main(String[] args) {
        CacheManager manager = new CacheManagerImpl();

        manager.storeInCache("id", "12345");
        manager.retrieveFromCache("id");

        manager.clearCache();
        manager.retrieveFromCache("id");
    }
}
