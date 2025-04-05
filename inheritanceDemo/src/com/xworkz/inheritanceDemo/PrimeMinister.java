package com.xworkz.inheritanceDemo;

public class PrimeMinister extends Country {

    PrimeMinister() {
        super();
        System.out.println("This is the Prime Minister");
    }

    @Override
    public void name() {
        System.out.println("Country ruled by Prime Minister");
    }

    @Override
    public void population() {
        System.out.println("Population managed under governance");
    }

    @Override
    public void nationalAnthem() {
        System.out.println("Respecting the national anthem at events");
    }

    @Override
    public void independenceYear() {
        System.out.println("Remembering independence and leading forward");
    }

    @Override
    public void currency() {
        System.out.println("Managing the currency value and economy");
    }

    public void leaderName() {
        System.out.println("Prime Minister: Narendra Modi");
    }

    public void termYears() {
        System.out.println("Serves for 5 years per term");
    }

    public void responsibilities() {
        System.out.println("Responsible for governing the country");
    }

    public void policies() {
        System.out.println("Introduces and implements policies");
    }

    public void work() {
        System.out.println("Maintains international relations");
    }
}
