class Cricket {
    Ticket ticket;

    Cricket(Ticket ticket) {
        this.ticket = ticket;
        System.out.println("Cricket instance created with ticket type: " + ticket.type);
    }
}
