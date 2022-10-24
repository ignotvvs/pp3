public class Book {
    
    //attributes
    String title,genre,author;
    int currentPage = 0, pages;
    
    //methods
    public void displayInfo() {
        System.out.println("Title: " + title + "\nGenre: " + genre 
                            + "\nAuthor: " + author );
    }
    public void turnPage() {
        if (currentPage < pages) {
            currentPage++;
        } else {
            System.out.println("Reached the end of the book.");
        }
    }
    public void displayPageStat() {
        System.out.println("Total pages: "+ pages + "\nCurrent page: " + currentPage);
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "For Whom the Bell Tolls";
        b1.genre = "war novel";
        b1.author = "Ernest Hemingway";
        b1.pages = 554;
        
        Book b2 = new Book();
        b2.title = "Iliad";
        b2.genre = "epic poetry";
        b2.author = "Homer";
        b2.pages = 560;
        
        b1.displayInfo();
        b1.turnPage();
        b1.displayPageStat();
    }
}