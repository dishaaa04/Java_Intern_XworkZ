class Wire {
    String material;
    int length;

    Wire(String material, int length) {
        this.material = material;
        this.length = length;
    }

    void checkConnectivity() {
        System.out.println("Wire is properly connected.");
    }
}