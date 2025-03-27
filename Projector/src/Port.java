class Port {
    String type;
    int version;

    Port(String type, int version) {
        this.type = type;
        this.version = version;
    }

    void showPortDetails() {
        System.out.println("Port Type: " + type + ", Version: " + version);
    }
}
