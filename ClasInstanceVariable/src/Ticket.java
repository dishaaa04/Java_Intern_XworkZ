class Ticket {
    TicketType type;
    double cost;

    Ticket(TicketType type, double cost) {
        this.type = type;
        this.cost = cost;
        System.out.println("Ticket created: " + type + " with cost: " + cost);
    }
}
