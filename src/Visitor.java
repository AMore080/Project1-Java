public class Visitor {
    private String name;
    private int age;
    private String ticketType;
    private String ridePreference;

    /* Constructors for the class. One with 3 parameters for the
    optional ridePreference and another with 2 for the required parameters
    if a user does not have a ridePreference. Ticket type will be auto
    assigned based on the age in the TicketSystem class.
     */

    Visitor(String n, int a, String r){
        name = n;
        age = a;
        ridePreference = r;
    }

    Visitor(String n, int a){
        name = n;
        age = a;
    }

    // Setters for the class
    public void setName(String n){
        name = n;
    }

    public void setAge(int a){
        age = a;
    }

    public void setTicketType(String t){
        ticketType = t;
    }

    public void setRidePreference(String r){
        ridePreference = r;
    }

    // Getters
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public String getTicketType(){
        return ticketType;
    }

    public String getRidePreference(){
        return ridePreference;
    }

    public String toString(){
        String result = "";
        result = name + " " + age + " " + ridePreference;
        return result;
    }
}
