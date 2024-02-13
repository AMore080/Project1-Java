public class TicketSystem {
    void purchaseTicket(Visitor visitor){
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

    void joinRideQueue(Visitor visitor, String rideName){
        if(rideName == "Roller Coaster"){
            visitor.setRidePreference(rideName);
        }
    }
}
