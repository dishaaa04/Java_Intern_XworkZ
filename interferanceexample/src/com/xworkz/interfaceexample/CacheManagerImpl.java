package com.xworkz.interfaceexample;

public class CacheManagerImpl implements CacheManager {

    String storedKey;
    String storedValue;

    @Override
    public void storeInCache(String key, String value) {
        storedKey = key;
        storedValue = value;
        System.out.println("Stored: Key = " + key + ", Value = " + value);
    }

    @Override
    public void retrieveFromCache(String key) {
        if (key != null && key.equals(storedKey)) {
            System.out.println("Retrieved: Key = " + key + ", Value = " + storedValue);
        } else {
            System.out.println("Key not found in cache.");
        }
    }

    @Override
    public void clearCache() {
        storedKey = null;
        storedValue = null;
        System.out.println("Cache cleared.");
    }
}
