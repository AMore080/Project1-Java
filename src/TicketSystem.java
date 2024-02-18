import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class TicketSystem {
    Queue<String> rollerQueue = new LinkedList<>();
    Stack<String> ticketStack = new Stack<>();
    public void purchaseTicket(Visitor visitor){
        if(visitor.getAge() >= 18){
            visitor.setTicketType("Adult");
        }
        else if (visitor.getAge() < 18){
            visitor.setTicketType("Child");
        }
        else if(visitor.getAge() >= 60){
            visitor.setTicketType("Senior");
        }
    }

    public void joinRideQueue(Visitor visitor, String rideName){
        System.out.println("Joining Ride!");
        //Check if the visitor has a ticket, if not it will initiate this if statement.
        if(visitor.getTicketType() == null){
            System.out.println("You have no ticket!");
        }
        if(Objects.equals(rideName, "RollerCoaster")){
            rollerQueue.offer(visitor.getName());
        }
    }

}
