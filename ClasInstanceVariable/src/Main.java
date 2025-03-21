public class Main {
    public static void main(String[] args) {
        Clip[] clips = {
                new Clip(Color.RED),
                new Clip(Color.BLUE),
                new Clip(Color.GREEN),
                new Clip(Color.YELLOW),
                new Clip(Color.BLACK)
        };

        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clips);

        Ticket ticket = new Ticket(TicketType.VIP, 500.0);
        Cricket cricket = new Cricket(ticket);
        Brush brush = new Brush(Color.BLUE);

        Virat virat = new Virat(brush, clips, ticket, cricket);
    }
}