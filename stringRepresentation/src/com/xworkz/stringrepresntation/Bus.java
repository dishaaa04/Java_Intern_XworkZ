package com.xworkz.stringrepresntation;

public class Bus {
    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Bus) {
                Bus other = (Bus) obj;
                return this.route.equals(other.route);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bus{route='" + route + "'}";
    }

    @Override
    public int hashCode() {
        return route.hashCode();
    }
}
