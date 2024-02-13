import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<String> rideQueue = new LinkedList<>();
        TicketSystem ticketSystem = new TicketSystem();
        Visitor visitor1 = new Visitor("Alex", 22);

        ticketSystem.purchaseTicket(visitor1);
        ticketSystem.joinRideQueue(visitor1);
        rideQueue.offer(visitor1.getRidePreference());
        System.out.println(visitor1.getTicketType());
        System.out.print(rideQueue.peek());
    }
}