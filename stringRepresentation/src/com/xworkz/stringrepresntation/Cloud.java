package com.xworkz.stringrepresntation;

public class Cloud {
    private String provider;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Cloud) {
                Cloud other = (Cloud) obj;
                return this.provider.equals(other.provider);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cloud{provider='" + provider + "'}";
    }

    @Override
    public int hashCode() {
        return provider.hashCode();
    }
}
