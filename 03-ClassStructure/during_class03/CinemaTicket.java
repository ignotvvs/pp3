public class CinemaTicket {
    
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int seat, row;
    double price;
    
    public CinemaTicket(String t, int s, int r) {
        filmTitle = t;
        seat = s;
        row = r;
        if (row <= 2) {
            price = 10;
        } else {
            price = 25;
        }
    }
    
    public void displayTicketDets() {
        System.out.println("Cinema name: " + cinemaName + "\nFilm title: " + filmTitle
                            + "\nSeat: " + seat + "\nRow: " + row + "\nPrice: " + price);                        
    }
    
    public static void main(String[] args) {
        CinemaTicket t1 = new CinemaTicket("Gladiator",15,2);
        CinemaTicket t2 = new CinemaTicket("Gladiator",4,7);
        t1.displayTicketDets();
        System.out.println();
        t2.displayTicketDets();
    }
}