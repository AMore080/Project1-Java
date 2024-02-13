public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();
        Visitor visitor1 = new Visitor("Alex", 22);

        ticketSystem.purchaseTicket(visitor1);
        System.out.println(visitor1.getTicketType());
    }
}