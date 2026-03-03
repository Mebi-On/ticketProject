class EventInfo{
    String id;
    String name;
    String date;
    int price;
    String description;
    String location;
    int capacity;
    int ticketsPerPerson;

    public EventInfo(String id, String name, String date, int price,
                 String description, String location,
                 int capacity, int ticketsPerPerson) {

        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.description = description;
        this.location = location;
        this.capacity = capacity;
        this.ticketsPerPerson = ticketsPerPerson;
        
    }

    public void display(){
        System.out.println("Event Name: " + this.name);
        System.out.println("Date: " + this.date);
        System.out.println("Price: " + this.price);
        System.out.println("Description: " + this.description);
        System.out.println("Location: " + this.location);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Tickets Per Person: " + this.ticketsPerPerson);
        System.out.println("---------------------------------------------");
    }
    public String getId(){ return this.id; }
    public String getName(){ return this.name; }
    public String getDate(){ return this.date; }
    public int getPrice(){ return this.price; }
    public String getDescription(){ return this.description; }
    public String getLocation(){ return this.location; }
    public int getCapacity(){ return this.capacity; }
    public int getTicketsPerPerson(){ return this.ticketsPerPerson; }
}
