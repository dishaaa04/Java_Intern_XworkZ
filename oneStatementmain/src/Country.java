class Country {
    private PrimeMinister primeMinister;
    private Minister[] ministers;
    private Security security;
    private State[] states;

    public Country() {
        // Sample initialization
        this.primeMinister = new PrimeMinister();
        this.ministers = new Minister[] {new Minister()};
        this.security = new Security();
        this.states = new State[] {new State()};
    }

    public void display() {
        System.out.println("Country Details:");
        primeMinister.display();
        System.out.println("Security Personnel: " + security.getPersonnel().length);
    }
}