import com.xworkz.count.country2.*;


import com.xworkz.count.country2.*; 

public class Country {

    String continent;
    int population;
    String name;
    String president;

    Minister minister;
    State[] states;
    Security security;
    Detail detail;
    Experience experience;
    House house;
    HouseKeep houseKeep;

    Country(String continent, int population, String name, String president) {
        this.continent = continent;
        this.population = population;
        this.name = name;
        this.president = president;

        // Creating Portfolio array
        Portfolio[] portfolios = {
                new Portfolio("Finance", "Economy", 500, "Raj"),
                new Portfolio("Defense", "Military", 800, "Raj"),
                new Portfolio("Health", "Medical", 300, "Raj"),
                new Portfolio("Education", "Learning", 200, "Raj")
        };

        // Creating House, Security, and PersonalAssistant
        House house = new House("Official Residence", "Capital City", 3, true);
        Security security = new Security("Z+ Security", 5, 50, "National Agency");
        PersonalAssistant personalAssistant = new PersonalAssistant("John Doe", 40, "Finance", "Budgeting");

        // Assigning Minister
        this.minister = new Minister("Raj", "Science", 5, "Democratic Party", portfolios, house, security, personalAssistant);

        // Creating State array
        this.states = new State[] {
                new State("Karnataka", "Bangalore", 70000000, "Basavaraj Bommai"),
                new State("Maharashtra", "Mumbai", 110000000, "Eknath Shinde"),
                new State("Tamil Nadu", "Chennai", 75000000, "M. K. Stalin"),
                new State("Kerala", "Thiruvananthapuram", 35000000, "Pinarayi Vijayan")
        };

        // Experience Details
        ExperienceDetail expDetail1 = new ExperienceDetail("CompanyA", 5, "Manager", 75000);
        ExperienceDetail expDetail2 = new ExperienceDetail("CompanyB", 3, "Developer", 50000);
        this.experience = new Experience("IT", 8, true, new ExperienceDetail[]{expDetail1, expDetail2});

        // Skill
        Skill skill = new Skill("Java", 9, true, experience);

        // Personnel
        Personnel personnel1 = new Personnel("John Doe", 101, "Security Head", skill);
        Personnel personnel2 = new Personnel("Jane Doe", 102, "Security Officer", skill);
        this.security = new Security(new Personnel[]{personnel1, personnel2});

        // Transport
        Transport transport = new Transport("Bus", 50, "Route A", true);

        // Housekeeping
        this.houseKeep = new HouseKeep(transport);

        // House & Rooms
        Room room1 = new Room("Deluxe", 400, true, 5000);
        Room room2 = new Room("Suite", 600, false, 8000);
        this.house = new House("Alice", "New York", new Room[]{room1, room2});

        // Detail
        this.detail = new Detail("Apartment", 250000, "Owned", "Alice");
    }

    void display() {
        System.out.println("Country: " + name + ", Continent: " + continent + ", Population: " + population + ", President: " + president);

        if (minister != null) minister.display();

        if (states != null) {
            for (State s : states) {
                if (s != null) s.display();
            }
        }

        if (security != null) security.display();
        if (detail != null) System.out.println(detail);
        if (experience != null) System.out.println(experience);
        if (house != null) house.display();
        if (houseKeep != null) houseKeep.display();
    }
}