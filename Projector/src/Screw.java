class Screw {
    String type;
    int size;

    Screw(String type, int size) {
        this.type = type;
        this.size = size;
    }

    void tighten() {
        System.out.println("Tightening screw of type " + type);
    }
}