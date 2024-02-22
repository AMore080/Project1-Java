import java.util.*;

public class TicketSystem {
    Queue<String> rollerQueue = new LinkedList<>();
    Queue<String> kiddieQueue = new LinkedList<>();
    Stack<String> ticketStack = new Stack<>();

    // Checks the visitors age and assigns a ticket based on what stage of life they are at
    public void purchaseTicket(Visitor visitor){
        if(visitor.getAge() >= 18){
            visitor.setTicketType("Adult");
            ticketStack.push(visitor.getName());
        }
        else if (visitor.getAge() < 18){
            visitor.setTicketType("Child");
            ticketStack.push(visitor.getName());
        }
        else if(visitor.getAge() >= 60){
            visitor.setTicketType("Senior");
            ticketStack.push(visitor.getName());
        }
    }

    // Will join the ride queue and will not join if the ticket has not been assigned
    public void joinRideQueue(Visitor visitor, String rideName){
        System.out.println("Joining Ride!");
        //Check if the visitor has a ticket, if not it will initiate this if statement.
        if(visitor.getTicketType() == null){
            System.out.println("You have no ticket!");
        }

        // These check what option the user selected and then adds them to the queue based on the parameters.
        if(Objects.equals(rideName, "Roller Coaster") && visitor.getAge() >= 18){
            rollerQueue.offer(visitor.getName());
        }

        if(Objects.equals(rideName, "Kiddie Coaster") && visitor.getAge() < 18){
            System.out.println("Sorry, to the Kiddie Coaster you go.");
            kiddieQueue.offer(visitor.getName());
        }
    }

    public void simulateRides(){
        // Will loop until the specified ride queue is empty. It will remove the head of the queue and then sleep for a few
        // seconds before continuing with the next element.
        while(!rollerQueue.isEmpty()){
            String rider = rollerQueue.poll();
            System.out.println(rider + " is riding the Roller Coaster!");

            try {
                Thread.sleep(new Random().nextInt(5) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while(!kiddieQueue.isEmpty()){
            String kidRider = kiddieQueue.poll();
            System.out.println(kidRider + " is riding the Kiddie Coaster!");

            try {
                Thread.sleep(new Random().nextInt(5) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
