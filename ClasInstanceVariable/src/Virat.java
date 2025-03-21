class Virat {
    Brush brush;
    Clip[] clips;
    Ticket ticket;
    Cricket cricket;

    Virat(Brush brush, Clip[] clips, Ticket ticket, Cricket cricket) {
        this.brush = brush;
        this.clips = clips;
        this.ticket = ticket;
        this.cricket = cricket;
        System.out.println("Virat instance created.");
    }
}
