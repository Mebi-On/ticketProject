import java.util.*;

public class ticketEvent {

    public static void main(String[] args){

        ArrayList<EventInfo> events = new ArrayList<>();

        events.add(new EventInfo("Event1", "V5","March 28th",2500,"Fun Fun times","Takwa Bay", 250, 4));
        events.add(new EventInfo("Event2", "Ravoween","April 2nd",5000,"Lets go tp the beach beach what they going to say?","Takwa Bay", 500, 2));
        events.add(new EventInfo("Event3", "Rooftop","May 15th",3000,"Roof top rave vibes","Ebony Life", 300, 1));

        ticketEventUtil.printEvents(events);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the name of the event: ");
        String userInputName = userInput.next();
        ticketEventUtil.findEvent(events, userInputName);
        // int a = events.get(0).getTicketsPerPerson();
        // int b = events.get(0).getCapacity();
        // int c = events.get(0).getPrice();
        // System.out.println("Tickets Per Person: " + a);
        // System.out.println("Capacity: " + b);
        // System.out.println("Price: " + c);
        // events.get(1).display();
        // events.get(2).display();
    }
}