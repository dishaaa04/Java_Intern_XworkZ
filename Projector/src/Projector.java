class Projector {
    Lens lens;
    Lamp lamp;
    Port port;
    Wire wire;
    Board board;
    Button button;
    Panel panel;
    Remote remote;
    Screw screw;

    Projector() {
        lens = new Lens("Convex", 50);
        lamp = new Lamp(200, "Philips");
        port = new Port("HDMI", 2);
        wire = new Wire("Copper", 2);
        board = new Board("X123", "Sony");
        button = new Button("Round", "Power");
        panel = new Panel(5, "Plastic");
        remote = new Remote("Samsung", 3000);
        screw = new Screw("Flathead", 5);
    }

    void startProjector() {
        System.out.println("Projector is starting...");
        lamp.turnOn();
        button.press();
    }

    public static void main(String[] args) {
        Projector projector = new Projector();
        projector.startProjector();
    }
}
