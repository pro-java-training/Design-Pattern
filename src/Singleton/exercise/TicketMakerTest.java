package Singleton.exercise;

public class TicketMakerTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int ticketId = TicketMaker.getInstance().getNextTicketId();
            System.out.println(ticketId);
        }
    }
}
