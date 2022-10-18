public class Date {
    
    public static void main(String[] args) {
        String day = "Friday";
        int date = 13;
        int year = 2077;
        String month = "April";
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.printf("European format: %s %d %s %d",day,date,month,year);
    }
}
