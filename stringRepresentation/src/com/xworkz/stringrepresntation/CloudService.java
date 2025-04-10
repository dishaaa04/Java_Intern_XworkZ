package com.xworkz.stringrepresntation;

public class CloudService {
    private String provider;
    private int storageLimit;
    private boolean isPaid;

    public CloudService(String provider, int storageLimit, boolean isPaid) {
        this.provider = provider;
        this.storageLimit = storageLimit;
        this.isPaid = isPaid;
    }

    @Override
    public String toString() {
        return "[provider=" + provider + ", storageLimit=" + storageLimit + "GB, isPaid=" + isPaid + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 777;
    }
}
