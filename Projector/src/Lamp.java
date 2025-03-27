class Lamp {
    int wattage;
    String brand;

    Lamp(int wattage, String brand) {
        this.wattage = wattage;
        this.brand = brand;
    }

    void turnOn() {
        System.out.println("Lamp is turned on.");
    }
}