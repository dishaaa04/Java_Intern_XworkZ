class Button {
    String shape;
    String function;

    Button(String shape, String function) {
        this.shape = shape;
        this.function = function;
    }

    void press() {
        System.out.println("Button " + function + " is pressed.");
    }
}
