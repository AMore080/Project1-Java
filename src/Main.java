import java.io.InputStream;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketSystem ticketSystem = new TicketSystem();
        System.out.println("Choose an option: ");
        System.out.println("1. Enter visitors");
        System.out.println("2. Start ride queues");
        System.out.println("3. Exit program");
        int option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println("How many visitors will ride today?");
                int num = sc.nextInt();
                for(int i = 0; i < num; i++){
                    String nm;
                    int ag;
                    String ride;
                    System.out.println("Enter the name of the visitor: ");
                    nm = sc.next();
                    System.out.println(nm);
                    System.out.println("Enter the age: ");
                    ag = sc.nextInt();
                    System.out.println("Select a ride: ");
                    ride = sc.next();
                    Visitor visitor = new Visitor(nm, ag, ride);
                    ticketSystem.purchaseTicket(visitor);
                    ticketSystem.joinRideQueue(visitor, visitor.getRidePreference());
                }
                break;
        }

//        Visitor visitor1 = new Visitor("Alex", 22, "Roller Coaster");
//        Visitor visitor2 = new Visitor("Nydia", 17, "Roller Coaster");


//        ticketSystem.purchaseTicket(visitor1);
//        ticketSystem.purchaseTicket(visitor2);
//        ticketSystem.joinRideQueue(visitor1, visitor1.getRidePreference());
//        ticketSystem.joinRideQueue(visitor2, visitor2.getRidePreference());

        for(String s : ticketSystem.rollerQueue){
            System.out.print(s + " ");
        }
    }
}