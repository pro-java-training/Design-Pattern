package Singleton.exercise;

public class TicketMaker {
    private static TicketMaker ticketMaker;

    private int ticketId = 1;

    private TicketMaker() {

    }

    public static TicketMaker getInstance() {
        if (ticketMaker == null) {
            ticketMaker = new TicketMaker();
        }
        return ticketMaker;
    }

    public synchronized int getNextTicketId() {
        return ticketId ++;
    }
}
