import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketSystem ticketSystem = new TicketSystem();
        int option;

        do
        {
            System.out.println("Choose an option: ");
            System.out.println("1. Enter visitors");
            System.out.println("2. Start ride queues");
            System.out.println("3. Exit program");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("How many visitors will ride today?");
                    int num = sc.nextInt();

                    for (int i = 0; i < num; i++) {
                        String nm;
                        int ag;
                        String ride = "";
                        int rideOption;

                        System.out.println("Enter the name of the visitor: ");
                            while(true){
                                try {
                                    nm = sc.next();
                                    break;
                                }
                                catch(InputMismatchException e){
                                    System.out.print("Enter a valid name: ");
                                    sc.nextLine();
                                }
                            }

                        System.out.println("Enter the age: ");
                            while(true){
                                try {
                                    ag = sc.nextInt();
                                    break;
                                }
                                catch(InputMismatchException e){
                                    System.out.print("Enter a valid age: ");
                                    sc.nextLine();
                                }
                            }

                        System.out.println("Select a ride (Enter a number listed): ");
                            if(ag >= 18){
                                System.out.println("1. Roller Coaster");
                                rideOption = sc.nextInt();

                                    while(rideOption != 1) {
                                        System.out.println("Try again. Select a ride: ");
                                        System.out.println("1. Roller Coaster");
                                        rideOption = sc.nextInt();

                                        if(rideOption == 1){
                                            ride = "Roller Coaster";
                                        }
                                    }

                            } else {
                                System.out.println("1. Kiddie Coaster");
                                rideOption = sc.nextInt();

                                    while(rideOption != 1) {
                                        System.out.println("Try again. Select a ride: ");
                                        System.out.println("1. Kiddie Coaster");
                                        rideOption = sc.nextInt();
                                    }

                                ride = "Kiddie Coaster";
                            }

                        Visitor visitor = new Visitor(nm, ag, ride);
                        ticketSystem.purchaseTicket(visitor);
                        ticketSystem.joinRideQueue(visitor, visitor.getRidePreference());
                    }
                    break;

                // Case 2 will start the ride Queues.
                case 2:
                    System.out.println("Starting the rides!");
                    ticketSystem.simulateRides();
                    break;
            }

            // Do-while will continue to loop this portion until the user enters the number 3 which will end it.
        } while (option != 3);

        System.out.println("Bye!");

        for (String s : ticketSystem.rollerQueue) {
            System.out.print(s + " ");
        }

    }
}