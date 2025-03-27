class Panel {
    int numberOfButtons;
    String material;

    Panel(int numberOfButtons, String material) {
        this.numberOfButtons = numberOfButtons;
        this.material = material;
    }

    void showPanelDetails() {
        System.out.println("Panel with " + numberOfButtons + " buttons made of " + material);
    }
}