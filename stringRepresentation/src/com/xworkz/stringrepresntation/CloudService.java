package com.xworkz.stringrepresntation;

public class CloudService {

    private String provider;
    private String region;
    private boolean supportsAI;

    public CloudService(String provider, String region, boolean supportsAI) {
        this.provider = provider;
        this.region = region;
        this.supportsAI = supportsAI;
    }

    @Override
    public String toString() {
        return "[provider=" + provider + ", region=" + region + ", supportsAI=" + supportsAI + "]";
    }
}
