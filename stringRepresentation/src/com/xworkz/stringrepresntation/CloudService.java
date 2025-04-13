package com.xworkz.stringrepresntation;

public class CloudService {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof CloudService) {
                CloudService other = (CloudService) obj;
                return this.type.equals(other.type);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CloudService{type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}
