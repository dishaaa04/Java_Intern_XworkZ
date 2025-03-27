class Board {
    String model;
    String manufacturer;

    Board(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    void showBoardInfo() {
        System.out.println("Board Model: " + model + ", Manufacturer: " + manufacturer);
    }
}
