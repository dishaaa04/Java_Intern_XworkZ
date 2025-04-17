package com.xworkz.interfaceexample;

public interface CacheManager {
    void storeInCache(String key, String value);
    void retrieveFromCache(String key);
    void clearCache();
}
