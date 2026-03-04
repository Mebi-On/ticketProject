import java.util.ArrayList;
public class ticketEventUtil {

    public static String findEvent(ArrayList<EventInfo> events, String userInputName){
        for(EventInfo eventName : events){
            if(userInputName.equalsIgnoreCase(eventName.getName())){
                eventName.display();
                return eventName.getId();
            }
        }
        System.out.println("Event not found.");
        return null;
    }

    public static void printEvents(ArrayList<EventInfo> events){
       for (int eventNumber = 0; eventNumber < events.size(); eventNumber++){
            System.out.println(events.get(eventNumber).getId());
            events.get(eventNumber).display();
            System.out.println();
        }
    }
