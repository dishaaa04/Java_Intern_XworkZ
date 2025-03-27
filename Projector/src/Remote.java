class Remote {
    String brand;
    int batteryCapacity;

    Remote(String brand, int batteryCapacity) {
        this.brand = brand;
        this.batteryCapacity = batteryCapacity;
    }

    void useRemote() {
        System.out.println("Using remote from " + brand);
    }
}