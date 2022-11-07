public class Room {
    
    int number,beds;
    boolean occupied = false;
    String guestName;
    
    public Room(int n) {
        number = n;
        beds = 2;
    }
    
    public Room(int n,int b) {
        number = n;
        beds = b;
    }
    
    public void checkin(String name) {
        guestName = name;
        occupied = true;
        
    }
    
    public String isOccupied() {
        String msg = occupied ? "Yes, guest name: "+ guestName : "No, no guests";
        return msg;
    }
    
    public String toString(){
        return "Room number: " + number + ", beds: " + beds
                            + ", is occupied: " + this.isOccupied();
    }
    
   /* public void displayStatus() {
        System.out.println("Room number: " + number + ", beds: " + beds
                            + ", is occupied: " + this.isOccupied());
    }*/
    
    public static void displayAll(Room[] r) {
        for (Room n: r) {
            System.out.println(n.toString());
        }
    }
    
    public static void displaySpec(Room[] r,int bedN) {
        for (Room n: r) {
            if (n.beds == bedN) {System.out.println(n.toString());}
        }
    }
    
    public static void displayAllStat(Room[] r) {
        int occup = 0;
        for (Room n: r) {
            if (n.occupied) {occup++;}
        }
        System.out.println("Occupied: " + occup + "\nVacant: " + (r.length-occup));
    }
    public static void displayAllStatBed(Room[] r) {
        int bed = 0;
        for (Room n: r) {
            if (!n.occupied) {bed+=n.beds;}
        }
        System.out.println("Available beds: " + bed);
    }
    
    public static void main(String[] args){
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
        rooms[2] = new Room(3);
        rooms[3] = new Room(4,3);
        rooms[4] = new Room(5,3);
        rooms[5] = new Room(6,1);
        rooms[3].checkin("Robert John Linder");
        System.out.println(rooms[3].toString());
        /*rooms[5].displayStatus();
        displayAll(rooms);
        displaySpec(rooms,3);
        displayAllStat(rooms);
        displayAllStatBed(rooms);*/
    }
}